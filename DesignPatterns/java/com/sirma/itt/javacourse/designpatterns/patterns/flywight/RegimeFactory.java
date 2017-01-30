package com.sirma.itt.javacourse.designpatterns.patterns.flywight;

import java.util.Hashtable;

/**
 * ITTE-1907 Flyweight design pattern.
 * 
 * @author Petar Ivanov
 */
public class RegimeFactory {
	private static final Hashtable<String, Regime> regime = new Hashtable<String, Regime>();

	/**
	 * Private constructor.
	 */
	private RegimeFactory() {
	}

	/**
	 * Setter method for instances of class Car.
	 * 
	 * @param driver
	 *            Driver's name
	 * @return Object of class Car.
	 */
	public static Regime getRegime(String driver) {
		Regime driveRegime = regime.get(driver);
		if (driveRegime == null) {
			driveRegime = new Car(driver);
			regime.put(driver, driveRegime);
			System.out.println("Regime for driver " + driver + " is created.");
		}
		return driveRegime;
	}
}
