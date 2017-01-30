package com.sirma.itt.javacourse.threads.synchronizedstack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1873 Syncronized stack.
 * 
 * @author Petar Ivanov
 */
public class AddElementToTheList implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(AddElementToTheList.class);
	private boolean run;
	private List list;
	private Object[] ObjectsToAdd;

	/**
	 * Constructor.
	 * 
	 * @param list
	 *            List that accepts objects.
	 * @param objects
	 *            Array with objects for adding to the list.
	 */
	public AddElementToTheList(List list, Object[] objects) {
		run = true;
		this.list = list;
		this.ObjectsToAdd = objects;
	}

	/**
	 * {@inheritDoc}
	 */
	public void run() {
		int index = 0;
		while (run) {
			try {
				synchronized (list) {
					if (list.getIndex() < list.getSize() && index < ObjectsToAdd.length) {
						list.addElement(ObjectsToAdd[index]);
						index++;
					}
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				LOGGER.info(Thread.currentThread().getName() + " was interrupted!");
			}
		}
	}
}
