package com.sirma.itt.javacourse.reflectionannotationregex.instancebyname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sirma.itt.javacourse.reflectionannotationregex.classinfo.ClassInfo;

/**
 * ITTE-1773 Run class.
 * 
 * @author Petar Ivanov
 */
public class RunNewInstaceByName {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunNewInstaceByName.class);

	/**
	 * Private constructor
	 */
	private RunNewInstaceByName() {
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nameOfClass = "java.lang.String";
		try {
			Object newInstance = NewInstanceByName.newInstance(nameOfClass);
			LOGGER.info(ClassInfo.getFields(newInstance));
			LOGGER.info(ClassInfo.getMethods(newInstance));
		} catch (ClassNotFoundException e) {
			LOGGER.info("No such class.", e);
		}
	}
}
