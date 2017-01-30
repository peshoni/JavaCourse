package com.sirma.itt.javacourse.designpatterns.patterns.facade;

/**
 * ITTE-1905 Facade design pattern.
 * 
 * @author Petar Ivanov
 */
public class FacadePatternDemo {
	/**
	 * Show dinner at a restaurant in which we have no access to the process of
	 * cooking.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Restourant restourant = new Restourant();
		restourant.orderingAppetizer();
		restourant.orderingSoup();
		restourant.orderingDessert();
		restourant.pay();
	}
}
