package com.sirma.itt.javacourse.threads.synchronizedthreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1872 Synchronized threads.
 * 
 * @author Petar Ivanov
 */
public class SynchronizedThread implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(SynchronizedThread.class);
	private final int sleep = 1;
	private static volatile boolean run;
	private int maxCountValue;
	private int currentValue;
	private static Lock lock;

	/**
	 * Constructor.
	 * 
	 * @param start
	 *            Start counting value.
	 * @param stop
	 *            Stop counting value.
	 */
	public SynchronizedThread(int start, int stop) {
		run = true;
		currentValue = start;
		maxCountValue = stop;
		lock = new ReentrantLock();
	}

	/**
	 * {@inheritDoc}
	 */
	public void run() {
		while (run && currentValue <= maxCountValue) {
			try {
				synchronized (lock) {
					LOGGER.info(Thread.currentThread().getName() + " - " + currentValue++);
					lock.notifyAll();
					lock.wait();
				}
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				LOGGER.info("The thread " + Thread.currentThread().getName() + " was interrupted!");
			}
		}
	}

	/**
	 * Setter method for run.
	 * 
	 * @param run
	 */
	public void setRun(boolean run) {
		SynchronizedThread.run = run;
	}
}
