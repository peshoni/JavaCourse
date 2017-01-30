package com.sirma.itt.javacourse.inputoutput.directorybrowser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1811 - Directory browser class contain a method in which the input string is determined whether this is a route
 * that leads to a file or directory.
 * 
 * @author Petar Ivanov
 */
public class DirectoryBrowser {
	private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryBrowser.class);

	/**
	 * Private constructor for utility class.
	 */
	private DirectoryBrowser() {
	}

	/**
	 * Method in which the input string is determined whether this is a route that leads to a file or directory.
	 * 
	 * @param path
	 *            Input string with path.
	 * @return String with what is found at this path.
	 */
	public static String fileOrDir(String path) {
		String result = null;
		try {
			Path pathTo = Paths.get(path);
			Files.newDirectoryStream(pathTo);
			result = "Directory";
			return result;
		} catch (NotDirectoryException exception) {
			LOGGER.info("This is path to file!", exception);
			result = "File";
		} catch (NoSuchFileException exception) {
			LOGGER.info("No such file!", exception);
			result = "ERROR";
		} catch (IOException e) {
			LOGGER.info("I/O exception occurs: ", e);
		}
		return result;
	}

	/**
	 * Shows directory content. If the string does not point to a directory method does nothing.
	 * 
	 * @param directoryName
	 *            Directory to process.
	 * @return String with directory info.
	 */
	public static String showDirContent(String directoryName) {
		return String.format("%s%s", System.lineSeparator(), listFilesAndFilesSubDirectories(directoryName));
	}

	/**
	 * Shows directory content.
	 * 
	 * @param directoryName
	 *            Directory to process.
	 * @return String with directory info.
	 */
	private static String listFilesAndFilesSubDirectories(String directoryName) {
		StringBuilder builder = new StringBuilder();
		File directory = new File(directoryName);
		if (!directory.isFile()) {
			File[] fList = directory.listFiles();
			for (File file : fList) {
				if (file.isDirectory()) {
					builder.append(listFilesAndFilesSubDirectories(file.getAbsolutePath()));
				} else if (file.isFile()) {
					builder.append(file.getAbsolutePath());
					builder.append(System.lineSeparator());
				}
			}
		}
		return builder.toString();
	}
}
