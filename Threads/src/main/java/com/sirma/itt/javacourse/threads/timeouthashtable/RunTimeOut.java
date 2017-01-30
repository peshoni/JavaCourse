package com.sirma.itt.javacourse.threads.timeouthashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1874 Timeout hashtable.
 * 
 * @author Petar Ivanov
 */
public class RunTimeOut {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunTimeOut.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long timeOut = 3000;
		long refresh = 99;
		final TimeoutHashTable<String, Object> table = new TimeoutHashTable<String, Object>(timeOut, refresh);

		Thread thrAdd = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <= 50; i++) {

					try {
						table.putObject(Integer.toString(i), "");
						table.printHashtable();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						LOGGER.info("The thread was interrupted.");
					}
					if (i == 50) {
						try {
							Thread.sleep(timeOut * 2);
						} catch (InterruptedException e) {
							LOGGER.info("The thread was interrupted.");
						}
						table.stopRefresh();
					}
				}
			}
		});
		thrAdd.start();
	}
}
