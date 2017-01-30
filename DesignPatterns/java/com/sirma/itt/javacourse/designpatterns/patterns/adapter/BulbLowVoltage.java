package com.sirma.itt.javacourse.designpatterns.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adapter design pattern.
 * 
 * @author Petar Ivanov
 */
public class BulbLowVoltage implements BulbAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(BulbLowVoltage.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void highVoltage() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void middleVoltage() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void lowVoltage() {
		LOGGER.info("This voltage alows me to shine!");
	}
}
