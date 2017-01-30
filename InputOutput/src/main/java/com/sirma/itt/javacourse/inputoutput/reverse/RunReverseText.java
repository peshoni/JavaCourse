package com.sirma.itt.javacourse.inputoutput.reverse;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1809 - Run ReverseText class.
 * 
 * @author Petar Ivanov
 */
public class RunReverseText {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunReverseText.class);

	/**
	 * Private constructor.
	 */
	private RunReverseText() {
	}

	/**
	 * Main method of RunReverse class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String file = "testReverse.txt";
		try {
			LOGGER.info(ReversText.readTextFile(file));
			ReversText.rewriteTextfile(ReversText.reversText(ReversText.readTextFile(file)), file);
			LOGGER.info(ReversText.readTextFile(file));
		} catch (IOException e) {
			LOGGER.info("An error occurred while reading the text file!", e);
		}
	}
}
