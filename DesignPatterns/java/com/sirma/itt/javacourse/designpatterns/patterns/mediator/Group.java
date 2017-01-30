package com.sirma.itt.javacourse.designpatterns.patterns.mediator;

import java.util.ArrayList;

/**
 * Group class creates list of users.
 * 
 * @author Petar Ivanov
 */
public class Group {
	private ArrayList<User> group;
	private String name;

	/**
	 * Construct group with given name.
	 * 
	 * @param groupName
	 *            The name fo group.
	 */
	public Group(String groupName) {
		this.setName(groupName);
		group = new ArrayList<User>();
	}

	/**
	 * Adding user to the group.
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		group.add(user);
	}

	/**
	 * Removing user from the group.
	 * 
	 * @param user
	 */
	public void removeUser(User user) {
		group.remove(user);
	}

	/**
	 * 
	 * @return List of members.
	 */
	public ArrayList<User> getList() {
		return group;
	}

	/**
	 * Getter method for name.
	 * 
	 * @return Name of the group.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name
	 * 
	 * @param name
	 *            To set.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
