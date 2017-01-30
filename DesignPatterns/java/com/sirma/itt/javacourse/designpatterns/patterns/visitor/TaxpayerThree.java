package com.sirma.itt.javacourse.designpatterns.patterns.visitor;

/**
 * ITTE-1919 Visitor design pattern.
 * 
 * @author Petar Ivanov
 */
public class TaxpayerThree implements Visitable {
	private int taxes;

	public TaxpayerThree() {
		taxes = 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void accept(Visit collector) {
		collector.visit(this);
		taxes += 300;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTaxes() {
		return taxes;
	}
}
