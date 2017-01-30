package com.sirma.itt.javacourse.threads.sleepingcounter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1871 Sleeping counter thread.
 * 
 * @author Petar Ivanov
 */
public class WaitCounter implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(WaitCounter.class);
	private static volatile boolean run;
	private int maxCountValue;
	private int currentNumber;
	private static Lock lock;

	/**
	 * Counter constructor.
	 * 
	 * @param start
	 *            Value to start counting.
	 * @param stop
	 *            To the value to count.
	 */
	public WaitCounter(int start, int stop) {
		run = true;
		this.currentNumber = start;
		this.maxCountValue = stop;
		lock = new ReentrantLock();
	}

	/**
	 * Setter method for run.
	 * 
	 * @param run
	 */
	private static void setRun(boolean run) {
		WaitCounter.run = run;
	}

	/**
	 * {@inheritDoc}
	 */
	public void run() {
		while (run && currentNumber <= maxCountValue) {
			try {
				synchronized (lock) {
					LOGGER.info(Thread.currentThread().getName() + " - " + currentNumber++);
					lock.notifyAll();
					lock.wait();
				}
			} catch (InterruptedException e) {
				LOGGER.info("The thread " + Thread.currentThread().getName() + " was interrupted!");
			}
		}
		setRun(false);
	}
}
