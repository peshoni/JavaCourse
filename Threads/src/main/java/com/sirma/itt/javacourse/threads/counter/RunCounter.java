package com.sirma.itt.javacourse.threads.counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1869 Stop thread counter.
 * 
 * @author Petar Ivanov
 */
public class RunCounter {
	public static final Logger LOGGER = LoggerFactory.getLogger(RunCounter.class);

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LOGGER.info("Insert symbol to stop counter.");
		Counter counter = new Counter(500);
		Thread thr = new Thread(counter);
		int currentNumber = 0;
		thr.start();
		try {
			reader.read();
			counter.setRun(false);
			currentNumber = counter.getCurrentNumber();
		} catch (IOException e) {
			LOGGER.info("I/O exception occurs!" + e.getMessage());
		}
		LOGGER.info("Value is : " + currentNumber);
	}
}
