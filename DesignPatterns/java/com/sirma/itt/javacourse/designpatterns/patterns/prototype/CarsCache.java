package com.sirma.itt.javacourse.designpatterns.patterns.prototype;

import java.util.Hashtable;

/**
 * ITTE-1912 Prototype design pattern. Cahce class that will set and save base
 * models.
 * 
 * @author Petar Ivanov
 */
public class CarsCache {
	private static Hashtable<String, Prototype> cars = new Hashtable<String, Prototype>();

	/**
	 * Load cache constructor.
	 */
	public CarsCache() {
		loadCache();
	}

	/**
	 * Getter method for {@link Prototype}
	 * 
	 * @param coupe
	 *            object name of which will receive a prototype.
	 * @return cloned {@link Prototype}
	 */
	public Prototype getPrototype(String coupe) {
		return (Prototype) cars.get(coupe).clone();
	}

	/**
	 * Loads the cache with instances of base models we will use.
	 */
	private void loadCache() {
		Van van = new Van();
		van.setEngine("gasoline");
		van.setColour("white");
		van.setCoupe("van");
		Jeep jeep = new Jeep();
		jeep.setEngine("gasoline");
		jeep.setColour("white");
		jeep.setCoupe("jeep");
		cars.put(van.getCoupe(), van);
		cars.put(jeep.getCoupe(), jeep);
	}
}
