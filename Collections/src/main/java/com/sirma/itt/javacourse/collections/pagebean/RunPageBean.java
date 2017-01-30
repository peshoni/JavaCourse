package com.sirma.itt.javacourse.collections.pagebean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * ITTE-1824 Run PageBean class.
 * 
 * @author Petar Ivanov
 * 
 */
public class RunPageBean {
	private static ArrayList<Integer> listOfIntegers;
	private static int size = 56;
	private static int pageSize = 10;

	/**
	 * Private constructor.
	 */
	private RunPageBean() {
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		listOfIntegers = new ArrayList<Integer>();
		int startPage = 1;
		for (int i = 0; i < size; i++) {
			listOfIntegers.add(i + 1);
		}
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			PageBean<Integer> book = new PageBean<Integer>(listOfIntegers, pageSize);
			book.readBook(reader, startPage);
		}
	}
}
