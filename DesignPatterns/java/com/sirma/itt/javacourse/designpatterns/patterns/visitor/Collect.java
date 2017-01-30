package com.sirma.itt.javacourse.designpatterns.patterns.visitor;

/**
 * ITTE-1919 Visitor design pattern.
 * 
 * @author Petar Ivanov
 */
public class Collect implements Visit {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(TaxpayerThree taxpayerThree) {
		System.out.println("The third taxpayer visited!");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(TaxpayerOne taxpayerOne) {
		System.out.println("The first taxpayer visited!");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(TaxpayerTwo taxpayerTwo) {
		System.out.println("The second taxpayer visited!");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(LocalCollect collector) {
		System.out.println("Taxes collected locally!");
	}
}
