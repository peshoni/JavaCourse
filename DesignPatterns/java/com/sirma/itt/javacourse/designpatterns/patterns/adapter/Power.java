package com.sirma.itt.javacourse.designpatterns.patterns.adapter;

import java.util.ArrayList;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adapter design pattern.
 * 
 * @author Petar Ivanov
 */
public class Power implements Adapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(Adapter.class);
	private ArrayList<Integer> supported = new ArrayList<Integer>();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void suply(int voltage) {
		Light light;
		Collections.addAll(supported, 220, 110, 12);
		if (supported.contains(voltage)) {
			light = new Light(voltage);
			light.suply(voltage);
		} else
			LOGGER.info("No bulbs such voltage!");
	}
}
