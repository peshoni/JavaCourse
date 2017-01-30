package com.sirma.itt.javacourse.designpatterns.patterns.memento;

/**
 * ITTE-1911 Memento design pattern. Demonstrates Memento pattern.
 * 
 * @author Petar Ivanov
 */
public class DemoMemento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CareTaker piccolo = new CareTaker();
		piccolo.nextFloor(1);
		piccolo.nextFloor(2);
		piccolo.nextFloor(3);
		piccolo.nextFloor(4);

		piccolo.undo();
		piccolo.undo();
		piccolo.printStack();
	}
}
