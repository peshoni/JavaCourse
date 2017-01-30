package com.sirma.itt.javacourse.networkingandgui.transmitter;

/**
 * ITTE-1910 - Mediator design pattern.
 * 
 * @author Petar Ivanov
 */
public class ChatRoom {
	/**
	 * Shows message from user in given group.
	 * 
	 * 
	 * @param user
	 *            Sender
	 * @param group
	 *            Receivers
	 * @param message
	 *            The message.
	 */
	public static void showMessage(User user, Group group, String message) {
		if (group.getList().contains(user)) {
			System.out.println("Message from group member.");
			group.removeUser(user);
			group.getList().forEach(e -> {
				System.out.println(group.getName() + ":" + message + " " + e.getName());
			});
			group.addUser(user);
		} else {
			System.out.println("Message from non group member");
			group.getList().forEach(e -> {
				System.out.println(group.getName() + ":" + message + " " + e.getName());
			});
		}
	}
}
