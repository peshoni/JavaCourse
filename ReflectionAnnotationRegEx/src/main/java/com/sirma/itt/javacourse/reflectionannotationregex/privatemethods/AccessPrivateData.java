package com.sirma.itt.javacourse.reflectionannotationregex.privatemethods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1774 Class that accessing private data.
 * 
 * @author Petar Ivanov
 */
public class AccessPrivateData {
	private static final Logger LOGGER = LoggerFactory.getLogger(AccessPrivateData.class);

	/**
	 * Private constructor for utility classes.
	 */
	private AccessPrivateData() {
	}

	/**
	 * Take the methods of the class.
	 * 
	 * @param object
	 *            For processing.
	 * @return {@link Method} array
	 * @throws IllegalArgumentException
	 */
	public static Method[] getPrivateMethod(final Object object) throws IllegalArgumentException {
		Method[] methods = null;
		Object newObject = object;
		methods = object.getClass().getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			methods[i].setAccessible(true);
			try {
				methods[i].invoke(newObject);
			} catch (IllegalAccessException e) {
				LOGGER.info("Access denied.", e);
			} catch (InvocationTargetException e) {
				LOGGER.info("Invocation target exception occurs.", e);
			}
		}
		return methods;
	}

	/**
	 * Take the private fields.
	 * 
	 * @param object
	 *            For processing.
	 * @return The fields of class.
	 * @throws IllegalArgumentException
	 *             When an exception occurs
	 */
	public static Field[] getField(Object object) throws IllegalArgumentException {
		Field[] fields = object.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
		}
		return fields;
	}
}
