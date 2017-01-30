package com.sirma.itt.javacourse.designpatterns.patterns.memento;

/**
 * ITTE-1911 Memento design pattern. Elevator that will travel.
 * 
 * @author Petar Ivanov
 */
public class Elevator {
	private int floor;

	/**
	 * Setter method for floor.
	 *
	 * @param floor
	 *            next floor to stop
	 */
	public void nextFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * Save the current floor.
	 * 
	 * @return Memento of current visited floor.
	 */
	public Memento saveFloor() {
		return new Memento(floor);
	}

	/**
	 * Return to previous level in memory.
	 * 
	 * @param memento
	 *            Memento for the previous floor.
	 */
	public void undo(Memento memento) {
		floor = memento.getFloor();
	}
}
