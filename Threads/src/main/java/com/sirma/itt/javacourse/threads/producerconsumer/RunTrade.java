package com.sirma.itt.javacourse.threads.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1875 Producer-Consumer. Run trade class that demonstrates trade process.
 * 
 * @author Petar Ivanov
 */
public class RunTrade {
	final static int capacity = 1050;
	public static final Logger LOGGER = LoggerFactory.getLogger(RunTrade.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse(capacity);

		Producer firtsProducer = new Producer("ProducerONE", 500, warehouse);
		Producer secondProducer = new Producer("ProduserTWO", 200, warehouse);
		Producer thirdProducer = new Producer("ProducerTHR", 300, warehouse);

		Thread productionFromFirstProducerThread = new Thread(firtsProducer);
		Thread productionFromSecondProducerThread = new Thread(secondProducer);
		Thread productionFromThirdProducerThread = new Thread(thirdProducer);

		Consumer firstConsumer = new Consumer("Consumerone", 1000, warehouse, 10);
		Consumer secondConsumer = new Consumer("Consumertwo", 500, warehouse, 11);
		Consumer thirdConsumer = new Consumer("ConsumerThr", 750, warehouse, 12);

		Thread firstConsumerThread = new Thread(firstConsumer);
		Thread secondConsumerThread = new Thread(secondConsumer);
		Thread thirdConsumerThread = new Thread(thirdConsumer);

		productionFromFirstProducerThread.start();
		productionFromSecondProducerThread.start();
		productionFromThirdProducerThread.start();

		firstConsumerThread.start();
		secondConsumerThread.start();
		thirdConsumerThread.start();
	}
}
