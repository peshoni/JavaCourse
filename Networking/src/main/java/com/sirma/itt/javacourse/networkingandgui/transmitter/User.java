package com.sirma.itt.javacourse.networkingandgui.transmitter;

/**
 * ITTE-1910 - Mediator design pattern. User class that sending message to the
 * {@link ChatRoom}.
 * 
 * @author Petar Ivanov
 */
public class User {
	private String name;

	/**
	 * Constructs user with name.
	 * 
	 * @param name
	 *            The name of the user.
	 */
	public User(String name) {
		this.name = name;
	}

	/**
	 * Getter method for Name.
	 * 
	 * @return Name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for Name.
	 * 
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sending message in chatroom.
	 * 
	 * @param user
	 *            From
	 * @param group
	 *            To members of the group
	 * @param message
	 *            The message.
	 */
	public void sendMessage(User user, Group group, String message) {
		ChatRoom.showMessage(this, group, message);
	}
}
