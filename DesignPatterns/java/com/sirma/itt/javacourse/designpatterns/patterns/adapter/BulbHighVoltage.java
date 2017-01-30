package com.sirma.itt.javacourse.designpatterns.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adapter design pattern.
 * 
 * @author Petar Ivanov
 */
public class BulbHighVoltage implements BulbAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(BulbHighVoltage.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void highVoltage() {
		LOGGER.info("This voltage alows me to shine!");
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
	}
}
