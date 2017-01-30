package com.sirma.itt.javacourse.designpatterns.patterns.observer;

import java.util.Hashtable;

/**
 * ITTE-1914 Observer design pattern. Sold class gets statistics from sales.
 * 
 * @author Petar Ivanov
 */
public class Sold extends Observer {
	private Hashtable<String, Integer> table;

	/**
	 * Constructs HashTable and attach to the Observers list.
	 * 
	 * @param seller
	 */
	public Sold(Seller seller) {
		table = new Hashtable<String, Integer>();
		this.seller = seller;
		this.seller.attachObserver(this);
	}

	/**
	 * Print entryset of the Hashtable.
	 */
	public void printSold() {
		System.out.println("  Sold: ");
		table.entrySet().forEach(element -> System.out.println(element.toString()));
	}

	/**
	 * Updated after being notified by Seller. {@inheritDoc}
	 */
	@Override
	public void update() {
		addSoldProduct(seller.getItem(), seller.getQuantity());
	}

	/**
	 * Adds sold products to the Hashtable
	 * 
	 * @param item
	 *            Item which will add.
	 * @param quantity
	 *            Quantity of items.
	 */
	private void addSoldProduct(String item, Integer quantity) {
		table.put(item, quantity);
	}
}
