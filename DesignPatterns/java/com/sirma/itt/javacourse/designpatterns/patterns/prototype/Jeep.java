package com.sirma.itt.javacourse.designpatterns.patterns.prototype;

/**
 * ITTE-1912 Prototype design pattern.
 * 
 * @author Petar Ivanov
 */
public class Jeep extends Prototype {
	public Jeep() {
		super.setCoupe("jeep");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void test() {
		System.out.println("This is the Jeep base model.");
	}
}
