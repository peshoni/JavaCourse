package com.sirma.itt.javacourse.reflectionannotationregex.arrangeobjects;

import java.util.Arrays;
import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1751 Arranging objects. Class that has methods for organizing classes in ascending order.
 * 
 * @author Petar Ivanov
 */
public class CustomArrangeObjects {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomArrangeObjects.class);

	/**
	 * Private constructors for utility classes.
	 */
	private CustomArrangeObjects() {
	}

	/**
	 * Method for sorting an array.
	 * 
	 * @param array
	 *            Array with elements of class Parent for processing.
	 * @return Sorted array.
	 */
	public static Parent[] sortArray(Parent[] array) {
		Arrays.asList(array).sort(new Comparator<Parent>() {
			public int compare(final Parent firstObject, final Parent secondObject) {
				return Integer.compare(firstObject.getClass().getAnnotation(Hierarchy.class).value(),
						secondObject.getClass().getAnnotation(Hierarchy.class).value());
			}
		});
		return array;
	}

	/**
	 * Method for printing elements of array of type {@link Parent}.
	 * 
	 * @param array
	 *            For print.
	 */
	public static void print(Parent[] array) {
		Arrays.asList(array).forEach(e -> LOGGER.info(e.getClass().getSimpleName().toString()));
	}
}
