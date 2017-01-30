package com.sirma.itt.javacourse.designpatterns.patterns.flywight;

/**
 * ITTE-1907 Flyweight design pattern.
 * 
 * @author Petar Ivanov
 */
public class Car implements Regime {
	private String driver;
	private double temperature;
	private String music;
	private String possitionSeat;

	/**
	 * Constricts a car that can be driven in different modes.
	 * 
	 * @param driver
	 *            Name of driver.
	 */
	public Car(String driver) {
		this.driver = driver;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drive() {
		System.out.println(driver + " listen " + music + ", on " + temperature + " degrees Celsius in possition seat: "
				+ possitionSeat);
	}

	/**
	 * Setter method for temperature.
	 *
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * Setter method for music.
	 *
	 * @param music
	 *            the music to set
	 */
	public void setMusic(String music) {
		this.music = music;
	}

	/**
	 * Setter method for possitionSeat.
	 *
	 * @param possitionSeat
	 *            the possitionSeat to set
	 */
	public void setPossitionSeat(String possitionSeat) {
		this.possitionSeat = possitionSeat;
	}
}
