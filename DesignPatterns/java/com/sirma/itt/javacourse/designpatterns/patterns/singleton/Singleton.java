package com.sirma.itt.javacourse.designpatterns.patterns.singleton;

/**
 * ITTE-1915 Singleton design pattern.
 * 
 * @author Petar Ivanov
 */
public final class Singleton {
	private static Singleton singleton = new Singleton();

	/**
	 * Private constructor.
	 */
	private Singleton() {
	}

	/**
	 * Gets only one instance of the class.
	 * 
	 * @return Instance of the class.
	 */
	public static Singleton getHandle() {
		return singleton;
	}
}
