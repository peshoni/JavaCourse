package com.sirma.itt.javacourse.objects.supermarket;

/**
 * 
 * 
 * @author Petar Ivanov
 */
public class Human {
	int humanAge;
	String name;

	// cons
	public Human(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		humanAge = age;
	}

	public int getAge() {
		return humanAge;
	}
}
