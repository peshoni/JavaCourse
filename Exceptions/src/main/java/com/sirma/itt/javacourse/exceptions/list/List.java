package com.sirma.itt.javacourse.exceptions.list;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1730 List class that processing array with elements. Class contains the following methods - add, remove and
 * prints elements.
 * 
 * @author Petar Ivanov
 */
public class List {
	private static final Logger LOGGER = LoggerFactory.getLogger(List.class);
	private int index;
	private Object[] array;

	/**
	 * Constructor that takes the size of the array that will use.
	 * 
	 * @param sizeOfarray
	 *            Size of array.
	 */
	public List(int sizeOfarray) {
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
		try {
			array[index] = object;
			index++;
		} catch (Exception e) {
			LOGGER.info("The list is full.");
			throw new FullListException(e);
		}
	}

	/**
	 * Removing the last element added.
	 */
	public void removeElement() {
		try {
			array[--index] = null;
		} catch (Exception e) {
			LOGGER.info("Empty list.");
			throw new EmptyListException(e);
		}
	}

	/**
	 * Prints not null records from the array.
	 * 
	 * @return String with not null elements.
	 */
	public String printList() {
		Object[] temp = new Object[index];
		System.arraycopy(array, 0, temp, 0, index);
		return Arrays.asList(temp).toString();
	}
}
