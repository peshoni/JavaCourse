package com.sirma.itt.javacourse.threads.synchronizedthreads;

/**
 * ITTE-1872 Synchronized threads.
 * 
 * @author Petar Ivanov
 */
public class RunSynchronizedThread {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SynchronizedThread firtsCounter = new SynchronizedThread(1, 5);
		SynchronizedThread secondCounter = new SynchronizedThread(1, 5);

		Thread first = new Thread(firtsCounter);
		Thread second = new Thread(secondCounter);

		first.start();
		second.start();
	}
}
