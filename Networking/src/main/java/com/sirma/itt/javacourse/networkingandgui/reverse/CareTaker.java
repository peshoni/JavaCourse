package com.sirma.itt.javacourse.networkingandgui.reverse;

import java.util.ArrayList;

/**
 * Memento design pattern. The CareTaker class which moves restores saved
 * messages.
 * 
 * @author Petar Ivanov
 */
public class CareTaker {
	private Message message;
	private ArrayList<Memento> messages;
	private String current;
	private int currentPossition;

	/**
	 * Create elevator to travel with.
	 */
	public CareTaker() {
		messages = new ArrayList<Memento>();
		message = new Message();
	}

	/**
	 * Sets the floor and keeps memory of his number.
	 * 
	 * @param floor
	 */
	public void nextMessage(String clientMessage) {
		messages.add(message.createMemento());
		currentPossition++;
		System.out.println(currentPossition);
		message.nextMessage(clientMessage);
		current = clientMessage;
	}

	/**
	 * Back to previous level.
	 */
	public String back() {
		String result = "";
		if (currentPossition > 0) {
			result = message.undo(messages.get(currentPossition - 1));
			currentPossition--;
		}
		return result;
	}

	public String forward() {
		String result = "";
		if (currentPossition < messages.size() - 1) {
			result = message.undo(messages.get(currentPossition + 1));
			currentPossition++;
			// System.out.println("This is next " + result);
		}
		if (currentPossition == messages.size() - 1) {
			result = getCurrent();
			// currentPossition++;
			// System.out.println("This is next " + result);
		}
		return result;
	}

	private String getCurrent() {
		return current;
	}

}
