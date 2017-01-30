package com.sirma.itt.javacourse.networkingandgui.reverse;

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
		piccolo.nextMessage("1");
		piccolo.nextMessage("2");
		piccolo.nextMessage("3");
		piccolo.nextMessage("4");
		piccolo.nextMessage("5");
		piccolo.nextMessage("6");
		// piccolo.printStack();
		System.out.println();
		System.out.println(piccolo.back());
		System.out.println(piccolo.back());
		System.out.println(piccolo.back());
		System.out.println(piccolo.back());
		System.out.println();
		System.out.println(piccolo.forward());
		System.out.println(piccolo.forward());
		System.out.println(piccolo.forward());
		System.out.println(piccolo.forward());
		System.out.println();
		System.out.println(piccolo.back());
		System.out.println(piccolo.back());
		System.out.println(piccolo.back());
		System.out.println(piccolo.back());

		// System.out.println(piccolo.getCurrent());

		// piccolo.printStack();
	}
}
