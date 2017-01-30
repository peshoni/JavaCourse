package com.sirma.itt.javacourse.reflectionannotationregex.classinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1748 Run ClassInfo class.
 * 
 * @author Petar Ivanov
 */
public class RunClassInfo {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunClassInfo.class);

	/**
	 * Private constructor.
	 */
	private RunClassInfo() {
	}

	/**
	 * Main method of ClassInfo class.
	 * 
	 * @param args
	 *            Args for method.
	 */
	public static void main(String[] args) {
		SomeClass object = new SomeClass();
		LOGGER.info(ClassInfo.getMethods(object));
		LOGGER.info(ClassInfo.getFields(object));
	}
}
