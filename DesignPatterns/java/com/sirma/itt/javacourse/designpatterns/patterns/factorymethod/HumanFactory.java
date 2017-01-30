package com.sirma.itt.javacourse.designpatterns.patterns.factorymethod;

/**
 * ITTE-1906 Factory method. Creates instance by name.
 * 
 * @author Petar Ivanov
 */
public class HumanFactory {
	/**
	 * Creates instance by name.
	 * 
	 * @param string
	 *            Name of the class.
	 * @return Object or null.
	 */
	public HumanInterface createInstance(String string) {
		if (string.equalsIgnoreCase("Male")) {
			return new Male();
		} else if (string.equalsIgnoreCase("Female")) {
			return new Female();
		}
		return null;
	}
}
