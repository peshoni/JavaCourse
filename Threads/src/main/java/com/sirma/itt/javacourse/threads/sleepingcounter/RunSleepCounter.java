package com.sirma.itt.javacourse.threads.sleepingcounter;

/**
 * ITTE-1871 Sleeping counter thread.
 * 
 * @author Petar Ivanov
 */
public class RunSleepCounter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SleepCounter firtsCounter = new SleepCounter(1, 5);
		SleepCounter secondCounter = new SleepCounter(1, 25);

		Thread firstThread = new Thread(firtsCounter);
		Thread secondThread = new Thread(secondCounter);

		firstThread.start();
		secondThread.start();
	}
}
