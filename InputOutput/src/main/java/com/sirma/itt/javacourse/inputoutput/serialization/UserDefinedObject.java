package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.Serializable;

/**
 * ITTE-1812 -Serializable class UserDefinedObject.
 * 
 * @author Petar Ivanov
 */
public class UserDefinedObject implements Serializable {

	/**
	 * SerialVersionUID.
	 */
	private static final long serialVersionUID = -769258840545964661L;
	private String name;
	private int age;
	private int height;

	/**
	 * Constructs object of the {@link UserDefinedObject}
	 * 
	 * @param name
	 *            Name
	 * @param age
	 *            Age
	 * @param height
	 *            Height
	 */
	public UserDefinedObject(String name, int age, int height) {
		this.setAge(age);
		this.setName(name);
		this.setHeight(height);
	}

	/**
	 * Getter method for name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter method for age.
	 *
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Getter method for height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Setter method for height.
	 *
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
}
