package com.sirma.itt.javacourse.designpatterns.patterns.prototype;

/**
 * ITTE-1912 Prototype design pattern.
 * 
 * @author Petar Ivanov
 */
public class Van extends Prototype {
	public Van() {
		super.setCoupe("van");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void test() {
		System.out.println("This is the Van base model.");
	}
}
