package com.sirma.itt.javacourse.designpatterns.patterns.visitor;

/**
 * ITTE-1919 Visitor design pattern.
 * 
 * @author Petar Ivanov
 */
public class VisitorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalCollect collector = new LocalCollect();
		collector.accept(new Collect());
		int taxes = collector.getTaxes();
		System.out.println("Collector gathered: " + taxes);
	}
}
