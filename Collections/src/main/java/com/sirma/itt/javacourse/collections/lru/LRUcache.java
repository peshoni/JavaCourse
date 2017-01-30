package com.sirma.itt.javacourse.collections.lru;

import java.util.LinkedHashMap;

/**
 * ITTE-1826 Class that cashes instances by specified key using LRU algorithm.
 *
 * @param <K>
 *            The type of keys maintained by this map.
 * @param <V>
 *            The type of mapped values.
 * @author Petar Ivanov
 */
public class LRUcache<K, V> extends LinkedHashMap<K, V> {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = -7281210537166310388L;
	private LinkedHashMap<K, V> cache;
	private int size;
	private Object mostRecentlyUsed;

	/**
	 * LRU cache constructor.
	 * 
	 * @param size
	 *            The size of cache.
	 */
	public LRUcache(int size) {
		this.size = size;
		cache = new LinkedHashMap<K, V>();
	}

	/**
	 * Adds entry to the {@link LinkedHashMap} according LRU algorithm.
	 * 
	 * @param key
	 *            To set.
	 * @param value
	 *            To set.
	 */
	public void addEntry(K key, V value) {
		if (!cache.containsKey(key)) {
			cache.put(key, value);
			mostRecentlyUsed = key;
			if (cache.size() > size) {
				for (K temp : cache.keySet()) {
					cache.remove(temp);
					break;
				}
			}
		} else {
			cache.remove(key);
			cache.put(key, value);
		}
	}

	/**
	 * Returns string with keys.
	 * 
	 * @return String with keys.
	 */
	public String printEntryes() {
		return cache.keySet().toString();
	}

	/**
	 * Getter method for most recently used object.
	 * 
	 * @return The most recently used object if hit or null if miss.
	 */
	public Object getObject() {
		return cache.get(mostRecentlyUsed);
	}
}
