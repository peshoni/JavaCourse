package com.sirma.itt.javacourse.threads.timeouthashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1874 Timeout hashtable. The table excludes from himself records stood over a given time.
 * 
 * @param <K>
 *            Type of key.
 * @param <V>
 *            Type of value.
 * @author Petar Ivanov
 */
public class TimeoutHashTable<K, V> extends Hashtable<K, V> implements Runnable {
	private static final Logger LOGGER = LoggerFactory.getLogger(TimeoutHashTable.class);
	private long timeout;
	private long refreshTime;
	private boolean run;
	private Hashtable<K, V> keyAndValue;
	private Hashtable<K, Long> keyAndTime;
	private Thread thread;
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 6860349451503240920L;

	/**
	 * Constructs TimeOut table including two hashtable and thread.
	 * 
	 * @param tiomeOut
	 *            Residence time in milliseconds.
	 * @param refresh
	 *            Time to refresh in milliseconds.
	 */
	public TimeoutHashTable(long tiomeOut, long refresh) {
		run = true;
		this.timeout = tiomeOut;
		this.refreshTime = refresh;
		keyAndValue = new Hashtable<K, V>();
		keyAndTime = new Hashtable<K, Long>();
		thread = new Thread(this);
		thread.start();
	}

	/**
	 * Insert keyset in the HashTable. Replace value if key allready exist. Notes the current time in the table with the
	 * times.
	 * 
	 * @param key
	 * @param value
	 */
	public synchronized void putObject(K key, V value) {
		if (keyAndValue.containsKey(key)) {
			keyAndValue.replace(key, value);
			keyAndTime.replace(key, System.currentTimeMillis());
		} else {
			keyAndValue.put(key, value);
			keyAndTime.put(key, System.currentTimeMillis());
		}
	}

	/**
	 * Returns object from hashtable by key. Notes in the table of times that the Object is visited.
	 * 
	 * @param key
	 *            For check in hashtable.
	 * @return object or null.
	 */
	public synchronized Object getObjectByKey(K key) {
		Object object = null;
		if (keyAndValue.containsKey(key)) {
			object = keyAndValue.get(key);
			keyAndTime.replace(key, System.currentTimeMillis());
		}
		return object;
	}

	/**
	 * Removes element from hashtables by key.
	 * 
	 * @param key
	 *            For check in hashtable.
	 * @return object or null.
	 */
	public Object removeObjectByKey(K key) {
		Object object = null;
		if (keyAndValue.containsKey(key) && keyAndTime.containsKey(key)) {
			object = keyAndValue.get(key);
			keyAndValue.remove(key);
			keyAndTime.remove(key);
		}
		return object;
	}

	public void run() {
		while (run) {
			removeOverTimeout();
			try {
				Thread.sleep(refreshTime);
			} catch (InterruptedException e) {
				LOGGER.info("Thread " + Thread.currentThread() + " was interrupted!");
			}
		}
	}

	/**
	 * Removes records from the table that stood in her more of that in the 'timeout'.
	 */
	private synchronized void removeOverTimeout() {
		Long currentMillis = System.currentTimeMillis();
		K key;
		for (Iterator<Map.Entry<K, Long>> iterator = keyAndTime.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<K, Long> entry = iterator.next();
			if (timeout <= (currentMillis - (Long) (entry.getValue()))) {
				key = entry.getKey();
				iterator.remove();
				keyAndValue.remove(key);
				LOGGER.info("Remove " + key + ", time spent " + (entry.getValue() - currentMillis));
				break;
			}
		}
	}

	/**
	 * Print hashtable.
	 */
	public void printHashtable() {
		LOGGER.info(keyAndValue.entrySet().toString());
	}

	/**
	 * Starts refresh.
	 */
	public void stopRefresh() {
		run = false;
	}

	/**
	 * Stops refresh.
	 */
	public void startRefresh() {
		run = true;
	}
}
