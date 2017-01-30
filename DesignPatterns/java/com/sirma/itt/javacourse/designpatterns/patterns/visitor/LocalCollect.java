package com.sirma.itt.javacourse.designpatterns.patterns.visitor;

import java.util.Arrays;

/**
 * ITTE-1919 Visitor design pattern.
 * 
 * @author Petar Ivanov
 */
public class LocalCollect implements Visitable {
	private int taxes;
	private Visitable[] taxpayers;

	/**
	 * Constructs list of payers.
	 */
	public LocalCollect() {
		taxpayers = new Visitable[] { new TaxpayerOne(), new TaxpayerTwo(), new TaxpayerThree() };
	}

	/**
	 * Visit all payers. {@inheritDoc}
	 */
	@Override
	public void accept(Visit collector) {
		Arrays.asList(taxpayers).forEach(e -> e.accept(collector));
		collector.visit(this);
	}

	/**
	 * Action performed on objects - collect taxes from each payers.
	 * {@inheritDoc}
	 */
	@Override
	public int getTaxes() {
		Arrays.asList(taxpayers).forEach(e -> taxes += e.getTaxes());
		return taxes;
	}

}
