package com.sirma.itt.javacourse.designpatterns.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adapter design pattern.
 * 
 * @author Petar Ivanov
 */
public class BulbMiddleVoltage implements BulbAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(BulbMiddleVoltage.class);

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
		LOGGER.info("This voltage alows me to shine!");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void lowVoltage() {
	}
}
