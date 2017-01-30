package com.sirma.itt.javacourse.designpatterns.patterns.iterator;

/**
 * ITTE-1909 Iterator design pattern. Contains methods boolean hasNext and
 * getter next object.
 * 
 * @author Petar Ivanov
 */
public interface Iterator {

	public boolean hasNext();

	public Object next();
}