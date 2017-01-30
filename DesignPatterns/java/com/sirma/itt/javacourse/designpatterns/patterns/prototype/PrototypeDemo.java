package com.sirma.itt.javacourse.designpatterns.patterns.prototype;

import java.util.Hashtable;

/**
 * ITTE-1912 Prototype design pattern. Demonstrates how Prototype design pattern
 * works.
 * 
 * @author Petar Ivanov
 */
public class PrototypeDemo {

	/**
	 * Takes a copy of the cache and change it to the desired result. Prints
	 * different modifications of the object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, Prototype> cars = new Hashtable<String, Prototype>();
		CarsCache cache = new CarsCache();

		Prototype origin = cache.getPrototype("van");
		Prototype firstVan = cache.getPrototype("van");
		firstVan.setColour("yellow");
		firstVan.setEngine("diesel");
		Prototype secondVan = cache.getPrototype("van");
		secondVan.setColour("blue");
		secondVan.setEngine("gasoline");

		cars.put("0", origin);
		cars.put("1", firstVan);
		cars.put("2", secondVan);
		cars.forEach((k, v) -> {
			System.out.println(
					String.format("# %s coupe: %s, colour: %s, engine: %s.", k, v.getCoupe(), v.colour, v.engine));
		});
	}
}
