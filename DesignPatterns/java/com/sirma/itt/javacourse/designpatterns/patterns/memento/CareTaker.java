package com.sirma.itt.javacourse.designpatterns.patterns.memento;

import java.util.Stack;

/**
 * ITTE-1911 Memento design pattern. The Caretaker class which moves the
 * elevator.
 * 
 * @author Petar Ivanov
 */
public class CareTaker {
	private Elevator elevator;
	private Stack<Memento> floors;

	/**
	 * Create elevator to travel with.
	 */
	public CareTaker() {
		floors = new Stack<Memento>();
		elevator = new Elevator();
	}

	/**
	 * Sets the floor and keeps memory of his number.
	 * 
	 * @param floor
	 */
	public void nextFloor(int floor) {
		floors.add(elevator.saveFloor());
		elevator.nextFloor(floor);
		System.out.println("Next floor: " + floor);
	}

	/**
	 * Back to previous level.
	 */
	public void undo() {
		if (!floors.isEmpty()) {
			elevator.undo(floors.pop());
		}
	}

	/**
	 * Print elements in the stack.
	 */
	public void printStack() {
		for (Memento memento : floors) {
			System.out.println("In stack:" + memento.getFloor());
		}
	}
}
