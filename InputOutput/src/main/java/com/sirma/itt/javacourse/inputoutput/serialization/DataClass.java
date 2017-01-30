package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1812 - Serialization. Class contains saveObject and getObject methods.
 * 
 * @author Petar Ivanov
 */

public class DataClass {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataClass.class);
	private static ObjectOutputStream output = null;
	private static ObjectInputStream input = null;

	/**
	 * Private constructor for utility class.
	 */
	private DataClass() {
	}

	/**
	 * Saving the object in file. If this file does not exist - the first was created.
	 * 
	 * @param path
	 *            Filename
	 * @param object
	 *            Instance of UserDefinedObject class.
	 * @throws IOException
	 *             When I/O exception occurs.
	 */
	public static void saveObject(String path, UserDefinedObject object) throws IOException {
		FileOutputStream outFile = new FileOutputStream(path);
		output = new ObjectOutputStream(outFile);
		output.writeObject(object);
		output.flush();
		output.close();
	}

	/**
	 * Reading of instructions by file path instance of the class User Defined Object and return it as a result. If no
	 * such file - throws IOException.
	 * 
	 * @param path
	 *            Path to the file.
	 * @return Object type - user defined object.
	 * @throws IOException
	 *             When I/O exception occurs.
	 */
	public static UserDefinedObject getObject(String path) throws IOException {
		FileInputStream inFile = new FileInputStream(path);
		input = new ObjectInputStream(inFile);
		UserDefinedObject object = null;
		try {
			object = (UserDefinedObject) input.readObject();
		} catch (ClassNotFoundException e) {
			LOGGER.info("Class not found!", e);
		}
		return object;
	}
}
