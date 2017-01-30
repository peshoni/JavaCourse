package com.sirma.itt.javacourse.threads.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1875 Consumer class. Consume goods from warehouse.
 * 
 * @author Petar Ivanov
 */
public class Consumer implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
	private Warehouse warehouse;
	private boolean run;
	private String name;
	private long timeBetweenConsumption;
	private final int maxPossibleQuantity;

	/**
	 * Construct an object with the following properties: Name of consumer, time between consumption, Name of warehouse
	 * and quantity that will be consumed.
	 * 
	 * @param name
	 *            The name of consumer.
	 * @param timeBetweenConsumption
	 *            Time between two consumptions.
	 * @param warehouse
	 *            Name of the warehouse which will be consumed.
	 * @param quantity
	 *            Quantity that will be consumed.
	 */
	public Consumer(String name, long timeBetweenConsumption, Warehouse warehouse, int quantity) {
		run = true;
		this.name = name;
		this.timeBetweenConsumption = timeBetweenConsumption;
		this.warehouse = warehouse;
		this.maxPossibleQuantity = quantity;
	}

	/**
	 * Checking for the presence of an amount of consumption. If it is available consumer takes it {@inheritDoc}
	 */
	public void run() {
		while (run) {
			try {
				synchronized (warehouse) {
					int beforeConsumption = warehouse.getCurrentAvailable();
					if (maxPossibleQuantity <= beforeConsumption) {
						warehouse.getGoods(maxPossibleQuantity);
						int afterConsumption = warehouse.getCurrentAvailable();
						LOGGER.info(
								name + "  " + beforeConsumption + "-" + maxPossibleQuantity + "=" + afterConsumption);
						Thread.sleep(timeBetweenConsumption);
					}
				}
			} catch (InterruptedException e) {
				LOGGER.info("The thread was interrupted! " + e.getLocalizedMessage());
			}
		}
	}
}
