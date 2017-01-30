package com.sirma.itt.javacourse.inputoutput.directorybrowser;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1811 - Directory browser.
 * 
 * @author Petar Ivanov
 */
public class RunDirectoryBrowser {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunDirectoryBrowser.class);

	/**
	 * Private constructor.
	 */
	private RunDirectoryBrowser() {
	}

	/**
	 * Main method of RunDirectoryBrowser class.
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String path = ".";
		LOGGER.info(DirectoryBrowser.fileOrDir(path));
		LOGGER.info(DirectoryBrowser.showDirContent(path));
	}
}
