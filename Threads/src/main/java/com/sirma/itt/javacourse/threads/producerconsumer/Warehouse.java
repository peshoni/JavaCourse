package com.sirma.itt.javacourse.threads.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1875 Producer-Consumer. Warehouse trades with a single type of goods and
 * given capacity.
 * 
 * @author Petar Ivanov
 */
public class Warehouse {
	public static final Logger LOGGER = LoggerFactory.getLogger(Warehouse.class);
	private int capacityOfWarehouse;
	private volatile int currentAvailable;

	/**
	 * Constructs warehouse with given capacity.
	 * 
	 * @param capacity
	 *            Warehouse capacity.
	 */
	public Warehouse(int capacity) {
		this.capacityOfWarehouse = capacity;
	}

	/**
	 * Supplying warehouse with goods.
	 * 
	 * @param units
	 *            Number of units for suplying warehouse.
	 */
	public void supplyWarehouse(int units) {
		currentAvailable += units;
	}

	/**
	 * Removing goods from warehouse.
	 * 
	 * @param get
	 *            Number of units for removing from warehouse.
	 */
	public void getGoods(int get) {
		currentAvailable -= get;
	}

	/**
	 * Getter method for capacityOfWarehouse.
	 *
	 * @return the capacityOfWarehouse
	 */
	public int getCapacityOfWarehouse() {
		return capacityOfWarehouse;
	}

	/**
	 * Getter method for currentAvailable.
	 *
	 * @return the currentAvailable
	 */
	public synchronized int getCurrentAvailable() {
		return currentAvailable;
	}
}
