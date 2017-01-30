package com.sirma.itt.javacourse.designpatterns.patterns.memento;

/**
 * ITTE-1911 Memento design pattern. Class that stores visited floors.
 * 
 * @author Petar Ivanov
 */
public class Memento {
	private int floor;

	/**
	 * Sve current floor of the elevator.
	 * 
	 * @param floor
	 *            Floor number.
	 */
	public Memento(int floor) {
		this.floor = floor;
	}

	/**
	 * Getter method for floor.
	 * 
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}
}
