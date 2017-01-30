package com.sirma.itt.javacourse.designpatterns.patterns.proxy;

/**
 * ITTE-1913 Proxy design pattern.
 * 
 * @author Petar Ivanov
 */
public class ProxyPatternDemo {
	/**
	 * Private constructor.
	 */
	private ProxyPatternDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyPattern integer = new IntegerProxy(200);
		System.out.println("Work with " + integer.getClass().getSimpleName());
		System.out.println(integer.sqrt());
	}
}
