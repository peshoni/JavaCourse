package com.sirma.itt.javacourse.threads.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1875 Producer class. Supplying synchronized warehouse with goods.
 * 
 * @author Petar Ivanov
 */
public class Producer implements Runnable {
	public static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
	private Warehouse warehouse;
	private volatile boolean run;
	private String name;
	private long timePerUnits;
	final int UNIT = 1;

	/**
	 * Construct an object with the following properties: Name of producer, time for producing an article unit for the
	 * given warehouse.
	 * 
	 * @param producer
	 *            String The name of the producer.
	 * @param timePerUnits
	 *            Time to produce one unit in milliseconds.
	 * @param warehouse
	 *            Warehouse which will come good.
	 * @author Petar Ivanov
	 */
	public Producer(String producerName, int timePerUnits, Warehouse warehouse) {
		run = true;
		this.name = producerName;
		this.timePerUnits = timePerUnits;
		this.warehouse = warehouse;
	}

	/**
	 * Verify that the warehouse has room for products derived from it, if it so supplies. {@inheritDoc}
	 */
	public void run() {
		while (run) {
			try {
				synchronized (warehouse) {
					int beforeSupplying = warehouse.getCurrentAvailable();
					if (UNIT + beforeSupplying <= warehouse.getCapacityOfWarehouse()) {
						warehouse.supplyWarehouse(UNIT);
						int afterSupplying = warehouse.getCurrentAvailable();
						LOGGER.info(name + "  " + beforeSupplying + "+" + UNIT + "=" + afterSupplying);
						Thread.sleep(timePerUnits);
					}
				}
			} catch (InterruptedException e) {
				LOGGER.info("The thread was interrupted! " + e.getLocalizedMessage());
			}
		}
	}
}
