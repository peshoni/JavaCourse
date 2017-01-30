package com.sirma.itt.javacourse.designpatterns.patterns.proxy;

/**
 * ITTE-1913 Proxy design pattern. Proxy class.
 * 
 * @author Petar Ivanov
 */
public class IntegerProxy implements ProxyPattern {
	private IntegerReal realInteger;

	/**
	 * Creates object by proxy class.
	 * 
	 * @param integer
	 *            Parameter for the constructor.
	 */
	public IntegerProxy(int integer) {
		realInteger = IntegerFactory.createInstance(integer);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return Calculated by {@link IntegerReal} value.
	 */
	@Override
	public double sqrt() {
		return realInteger.sqrt();
	}
}
