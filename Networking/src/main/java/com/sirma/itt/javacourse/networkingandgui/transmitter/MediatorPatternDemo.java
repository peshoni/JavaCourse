package com.sirma.itt.javacourse.networkingandgui.transmitter;

/**
 * ITTE-1910 - Mediator design pattern.
 * 
 * @author Petar Ivanov
 */
public class MediatorPatternDemo {

	/**
	 * Demonstrates conversation between users.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		User userOne = new User("Mika");
		User userTwo = new User("Petar");
		User userThree = new User("Nikolay");
		User userFour = new User("Kiril");

		Group group = new Group("strawberry");
		group.addUser(userOne);
		group.addUser(userThree);
		Group groupCh = new Group("cherry");
		groupCh.addUser(userTwo);
		groupCh.addUser(userFour);

		userOne.sendMessage(userOne, group, String.format("from %s - Hello,", userOne.getName()));
		userOne.sendMessage(userOne, groupCh, String.format("from %s - Hello,", userOne.getName()));
	}
}
