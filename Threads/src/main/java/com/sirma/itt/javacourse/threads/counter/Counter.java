package com.sirma.itt.javacourse.threads.counter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1869 Stop thread counter. Counter class that count from start value to the stop value with pause setted from
 * user.
 * 
 * @author Petar Ivanov
 */

public class Counter implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(Counter.class);
	private int currentNumber;
	private int pause;
	private volatile boolean run;

	/**
	 * Counter constructor.
	 * 
	 * @param pause
	 *            Time between increment.
	 */
	public Counter(int pause) {
		run = true;
		this.currentNumber = 1;
		this.pause = pause;
	}

	/**
	 * {@inheritDoc}
	 */
	public void run() {
		try {
			while (run) {
				LOGGER.info("Current number: " + currentNumber++);
				Thread.sleep(pause);
			}
		} catch (InterruptedException e) {
			LOGGER.info("Exception occurs: " + e.getMessage());
		}
	}

	/**
	 * Setter method for run.
	 * 
	 * @param run
	 *            to set.
	 */
	public void setRun(boolean run) {
		this.run = false;
	}

	/**
	 * Get current number.
	 * 
	 * @return current number.
	 */
	public int getCurrentNumber() {
		return currentNumber;
	}

}
