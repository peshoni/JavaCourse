package com.sirma.itt.javacourse.designpatterns.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ITTE-1903 Composite design pattern. Creates hierarchy of objects where each
 * object can be treated indipendently.
 * 
 * @author Petar Ivanov
 */
public class Military {
	private String rank;
	private String name;
	private List<Military> subordinates;
	private boolean isRoot = true;

	/**
	 * Construct object with a list of successors.
	 * 
	 * @param rank
	 *            Military rank.
	 * @param name
	 *            Name
	 */
	public Military(String rank, String name) {
		this.rank = rank;
		this.name = name;
		subordinates = new ArrayList<Military>();
	}

	/**
	 * Add object to the structure.
	 * 
	 * @param military
	 *            Object to add.
	 */
	public void add(Military military) {
		subordinates.add(military);
	}

	/**
	 * Remove object from the structure.
	 * 
	 * @param military
	 *            Object for remove.
	 */
	public void remove(Military military) {
		subordinates.remove(military);
	}

	/**
	 * Getter method for subordinates.
	 * 
	 * @return List with subordinates.
	 */
	public List<Military> getSubordinates() {
		return subordinates;
	}

	/**
	 * Print the structure recursively.
	 * 
	 * @param root
	 *            Current object.
	 * @return String that contains infornation about objects in the structure.
	 */
	public String printTree(Military root) {
		List<Military> temp = root.getSubordinates();
		StringBuilder builder = new StringBuilder();
		if (temp != null) {
			if (isRoot) {
				builder.append(toString());
				builder.append("\n");
				isRoot = false;
			}
			for (Military military : temp) {
				builder.append(military.toString());
				builder.append("\n");
				builder.append(printTree(military));
			}
		}
		return builder.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	public String toString() {
		return String.format("Rang: %s, name: %s.", rank, name);
	}
}
