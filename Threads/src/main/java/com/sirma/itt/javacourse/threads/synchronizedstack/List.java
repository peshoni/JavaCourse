package com.sirma.itt.javacourse.threads.synchronizedstack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1873 Syncronized stack.
 * 
 * @author Petar Ivanov
 * 
 */
public class List {
	public static final Logger LOGGER = LoggerFactory.getLogger(List.class);
	private int size;
	private int index;
	private Object[] array;

	/**
	 * Constructor.
	 * 
	 * @param sizeOfarray
	 *            Size of array.
	 */

	public List(int sizeOfarray) {
		this.size = sizeOfarray;
		array = new Object[sizeOfarray];
		index = 0;
	}

	/**
	 * Added elements of object type to the list.
	 * 
	 * @param object
	 *            The object that will add.
	 */
	public void addElement(Object object) {
		if (index < array.length) {
			array[index] = object;
			LOGGER.info(Thread.currentThread().getName() + " added - " + object + " List : " + printList());
			index++;
		}
	}

	/**
	 * Removing the last added element.
	 * 
	 * @return true True on success.
	 * 
	 */
	public void removeElement() {
		if (index > 0) {
			Object temp = array[index - 1];
			array[index - 1] = null;
			index--;
			LOGGER.info(Thread.currentThread().getName() + " removed " + temp + " List : " + printList());
		}
	}

	/**
	 * Method which prints not null records.
	 * 
	 * @return String with not null elements.
	 */
	private String printList() {
		StringBuilder builder = new StringBuilder();
		for (Object object : array) {
			if (object != null) {
				builder.append(object);
				builder.append(" ");
			}
		}
		return builder.toString();
	}

	/**
	 * Getter method for index.
	 *
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Getter method for size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
}
