package com.sirma.itt.javacourse.librariesandclasspath.secondtask;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;
import main.java.com.sirma.itt.javacourse.intro.arrayreverse.ArrayReverse;
import main.java.com.sirma.itt.javacourse.intro.arraysorting.ArraySorting;
import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1726 Class that uses previous project.
 * 
 * @author Petar Ivanov
 */
public class UsesJarIntro {
	private static final Logger LOGGER = LoggerFactory.getLogger(UsesJarIntro.class);
	int array[];

	/**
	 * Constructor.
	 */
	public UsesJarIntro() {
	}

	public void getParameters() {
		Scanner consoleInput = new Scanner(System.in);
		int size = GreatestCommonDivisor.insertInteger("Insert size: ", consoleInput);
		array = ArrayProcessing.insertsElements("Insert value: ", consoleInput, size);
		consoleInput.close();
	}

	public void printStatistic() {
		LOGGER.info("Completed array: " + ArrayProcessing.printsArray(array));
		int index = ArrayProcessing.getMinElementIndex(array);
		LOGGER.info("Index of min element: " + index);

		ArrayReverse.reverseArray(array);
		LOGGER.info("Reversed array:  " + ArrayProcessing.printsArray(array));

		ArraySorting.quickSort(array, 0, array.length - 1);
		LOGGER.info("Sorted array: " + ArrayProcessing.printsArray(array));

		LOGGER.info("Sum of elements:  " + ArrayProcessing.calculateSum(array));
	}

	/**
	 * Main method of UsesPackage class that invokes methods from package IntroJava.jar.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UsesJarIntro intro = new UsesJarIntro();
		intro.getParameters();
		intro.printStatistic();
	}
}
