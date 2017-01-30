package com.sirma.itt.javacourse.designpatterns.patterns.observer;

/**
 * ITTE-1914 Observer design pattern. Class demonstrates Observer Design
 * pattern.
 * 
 * @author Petar Ivanov
 */
public class RunObserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Seller warehouse = new Seller();
		Available listAvailable = new Available(warehouse);
		Sold listSold = new Sold(warehouse);

		listAvailable.addProduct("Potatoes", 500);
		listAvailable.addProduct("Tomatoes", 825);
		listAvailable.addProduct("Peaches", 120);
		listAvailable.printAvailable();

		warehouse.setSold("Potatoes", 238);
		warehouse.setSold("Tomatoes", 825);
		listSold.printSold();
		System.out.println("  After sold:");
		listAvailable.printAvailable();
	}
}
