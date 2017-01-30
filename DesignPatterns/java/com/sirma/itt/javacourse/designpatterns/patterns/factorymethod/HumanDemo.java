package com.sirma.itt.javacourse.designpatterns.patterns.factorymethod;

/**
 * ITTE-1906 Factory method.
 * 
 * @author Petar Ivanov
 */
public class HumanDemo {

	/**
	 * Demonstrates Factory Method pattern.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HumanFactory creator = new HumanFactory();

		HumanInterface female = creator.createInstance("female");
		female.basicFunction();

		HumanInterface male = creator.createInstance("male");
		male.basicFunction();
	}
}
