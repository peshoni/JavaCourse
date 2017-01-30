package com.sirma.itt.javacourse.designpatterns.patterns.chainofresponsibility;

/**
 * ITTE-1901 Chain of responsibility design pattern.
 * 
 * @author Petar Ivanov
 */
public class ChainDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String request = "First , second , all ...";
		Chain chain = new Chain(new FirstCatcher(), new SecondCatcher(), new LastCatcher());
		chain.handleRequest(request);
		Chain anotherChain = new Chain(new SecondCatcher(), new FirstCatcher(), new LastCatcher());
		anotherChain.handleRequest(request);
	}
}
