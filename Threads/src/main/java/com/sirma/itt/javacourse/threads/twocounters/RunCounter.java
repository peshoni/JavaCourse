package com.sirma.itt.javacourse.threads.twocounters;

/**
 * ITTE-1870 Two counters.
 * 
 * @author Petar Ivanov
 */
public class RunCounter {

	private RunCounter() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Counter firtsCounter = new Counter(1, 5);
		Counter secondCounter = new Counter(6, 20);

		Thread thr1 = new Thread(firtsCounter);
		Thread thr2 = new Thread(secondCounter);

		thr1.start();
		thr2.start();
	}
}
