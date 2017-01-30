package com.sirma.itt.javacourse.designpatterns.patterns.visitor;

/**
 * ITTE-1919 Visitor design pattern. Interface for the visitors for the
 * visitable objects.
 * 
 * @author Petar Ivanov
 */
public interface Visit {
	/**
	 * Visit the third taxpayer.
	 * 
	 * @param taxpayerThree
	 *            The instance to visit.
	 */
	public void visit(TaxpayerThree taxpayerThree);

	/**
	 * Visit the first taxpayer.
	 * 
	 * @param taxpayerOne
	 *            The instance to visit.
	 */
	public void visit(TaxpayerOne taxpayerOne);

	/**
	 * Visit the second taxpayer.
	 * 
	 * @param taxpayerTwo
	 *            The instance to visit.
	 */
	public void visit(TaxpayerTwo taxpayerTwo);

	/**
	 * Visit the local collector.
	 * 
	 * @param collector
	 *            The instance to visit.
	 */
	public void visit(LocalCollect collector);
}
