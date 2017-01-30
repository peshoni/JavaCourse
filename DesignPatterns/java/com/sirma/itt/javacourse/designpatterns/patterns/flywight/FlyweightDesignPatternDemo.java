package com.sirma.itt.javacourse.designpatterns.patterns.flywight;

/**
 * ITTE-1907 Flyweight design pattern. Demonstrates utilization of the object
 * Car.
 * 
 * @author Petar Ivanov
 */
public class FlyweightDesignPatternDemo {
	private FlyweightDesignPatternDemo() {
	}

	/**
	 * Allows user to define their own regime fo driving.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Car first = (Car) RegimeFactory.getRegime("Petar");
		first.setMusic("Classic");
		first.setTemperature(22);
		first.setPossitionSeat("down");
		Car second = (Car) RegimeFactory.getRegime("Nevena");
		second.setMusic("Country");
		second.setTemperature(26);
		second.setPossitionSeat("up");
		Car third = (Car) RegimeFactory.getRegime("Grigorii");
		third.setMusic("Rock");
		third.setTemperature(20);
		third.setPossitionSeat("middle");

		second.drive();
		third.drive();
		first.drive();
	}
}
