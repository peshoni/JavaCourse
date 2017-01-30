package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1812 - Run DataClass.
 * 
 * @author Petar Ivanov
 */
public class RunDataClass {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunDataClass.class);

	/**
	 * Private constructor
	 */
	private RunDataClass() {
	}

	/**
	 * Runner for the {@link DataClass}
	 * 
	 * @param args
	 *            Arguments for main method.
	 */
	public static void main(String[] args) {
		String path = "serializedObject.txt";
		UserDefinedObject object = new UserDefinedObject("Petar", 35, 180);
		try {
			DataClass.saveObject(path, object);
		} catch (IOException e) {
			LOGGER.info("There was an error in recording information!", e);
		}
		try {
			UserDefinedObject nextObject = DataClass.getObject(path);
			LOGGER.info(nextObject.getClass().toString());
		} catch (IOException e) {
			LOGGER.info("I/O exception occurs: ", e);
		}
	}
}
