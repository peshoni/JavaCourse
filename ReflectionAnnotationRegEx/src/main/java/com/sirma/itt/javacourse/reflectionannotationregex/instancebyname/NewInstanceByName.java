package com.sirma.itt.javacourse.reflectionannotationregex.instancebyname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1773 Class that instantiate class by name.
 * 
 * @author Petar Ivanov
 */
public final class NewInstanceByName {
	private static final Logger LOGGER = LoggerFactory.getLogger(NewInstanceByName.class);

	/**
	 * Private constructor for utility classes.
	 */
	private NewInstanceByName() {
	}

	/**
	 * Method to create a new instance by given name.
	 * 
	 * @param name
	 *            Name of class.
	 * @return New object.
	 * @throws ClassNotFoundException
	 *             When exception occurs.
	 */
	public static Object newInstance(final String name) throws ClassNotFoundException {
		Object instance = new Object();
		Class<?> clas = Class.forName(name);
		Class<?>[] interfaces = clas.getInterfaces();
		try {
			instance = clas.newInstance();
			LOGGER.info("Instantiated by name:" + instance.getClass());
		} catch (InstantiationException e) {
			LOGGER.info("Instatiation exception occurs.", e);
		} catch (IllegalAccessException e) {
			LOGGER.info("Illegal access exception occurs.", e);
		}
		for (int i = 0; i < interfaces.length; i++) {
			LOGGER.info(interfaces[i].toString());
		}
		return instance;
	}
}
