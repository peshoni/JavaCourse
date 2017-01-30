package com.sirma.itt.javacourse.objects.supermarket;

/**
 * 
 * @author Petar Ivanov
 */
public abstract class Emploee extends Human {

	int mounthSalary;

	public Emploee(String name) {
		super(name);
	}

	public void salary(int salary) {
		mounthSalary = salary;
	}

	public int getSalary() {
		return mounthSalary;
	}
}
