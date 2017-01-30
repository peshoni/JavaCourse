package com.sirma.itt.javacourse.designpatterns.patterns.adapter;

/**
 * Adapter design pattern.
 * 
 * @author Petar Ivanov
 */
public class Light implements Adapter {
	private static BulbAdapter bulbAdapter;

	/**
	 * Constructor
	 */
	public Light(int voltage) {
		switch (voltage) {
		case 220:
			bulbAdapter = new BulbHighVoltage();
			break;
		case 110:
			bulbAdapter = new BulbMiddleVoltage();
			break;
		case 12:
			bulbAdapter = new BulbLowVoltage();
			break;

		default:
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void suply(int voltage) {
		switch (voltage) {
		case 220:
			bulbAdapter.highVoltage();
		case 110:
			bulbAdapter.middleVoltage();
		case 12:
			bulbAdapter.lowVoltage();
			break;

		default:
			break;
		}
	}
}
