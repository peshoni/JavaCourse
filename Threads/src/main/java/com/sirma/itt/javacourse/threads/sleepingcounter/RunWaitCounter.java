package com.sirma.itt.javacourse.threads.sleepingcounter;

/**
 * ITTE-1871 Sleeping counter thread.
 * 
 * @author Petar Ivanov
 */
public class RunWaitCounter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WaitCounter firtsCounter = new WaitCounter(1, 5);
		WaitCounter secondCounter = new WaitCounter(1, 25);

		Thread firstThread = new Thread(firtsCounter);
		Thread secondThread = new Thread(secondCounter);

		firstThread.start();
		secondThread.start();
	}
}
