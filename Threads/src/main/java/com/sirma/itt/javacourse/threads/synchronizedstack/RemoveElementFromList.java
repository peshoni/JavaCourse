package com.sirma.itt.javacourse.threads.synchronizedstack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1873 Syncronized stack.
 * 
 * @author Petar Ivanov
 */
public class RemoveElementFromList implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(RemoveElementFromList.class);
	private List list;
	private boolean run;

	/**
	 * Constructor.
	 * 
	 * @param list
	 *            List, which will take out objects.
	 */
	public RemoveElementFromList(List list) {
		run = true;
		this.list = list;
	}

	/**
	 * {@inheritDoc}
	 */
	public void run() {
		while (run) {
			try {
				synchronized (list) {
					list.removeElement();
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				LOGGER.info(Thread.currentThread().getName() + " was interrupted!");
			}
		}
	}
}
