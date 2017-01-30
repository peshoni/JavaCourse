package com.sirma.itt.javacourse.designpatterns.patterns.state;

/**
 * ITTE-1916 State design pattern. Demonstrates State design pattern.
 * 
 * @author Petar Ivanov
 */
public class StatePatternDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bit bit = new Bit();
		bit.getState();

		State zero = new Zero();
		System.out.println(String.format("The state of %s is %s.", bit.getClass().getSimpleName(),
				Integer.toString(zero.getState(bit))));
		State one = new One();
		System.out.println(String.format("The state of %s is %s.", bit.getClass().getSimpleName(),
				Integer.toString(one.getState(bit))));
	}
}
