package com.sirma.itt.javacourse.designpatterns.patterns.visitor;

/**
 * ITTE-1919 Visitor design pattern. Interfase for visitable classes which
 * accepts collector.
 * 
 * @author Petar Ivanov
 */
public interface Visitable {
	/**
	 * Acepts visitors on the object.
	 * 
	 * @param collector
	 *            The visitor performs the action.
	 */
	public void accept(Visit collector);

	/**
	 * Get taxes from visited objects.
	 * 
	 * @return Amount of taxes after visit.
	 */
	public int getTaxes();
}
