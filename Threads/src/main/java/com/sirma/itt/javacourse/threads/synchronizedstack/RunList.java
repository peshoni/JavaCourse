package com.sirma.itt.javacourse.threads.synchronizedstack;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1873 Syncronized stack.
 * 
 * @author Petar Ivanov
 */
public class RunList {
	public static final Logger LOGGER = LoggerFactory.getLogger(RunList.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int capacity = 5;
		List newList = new List(capacity);
		Random generator = new Random();

		Object[] objects = new Object[50];
		for (int i = 0; i < objects.length; i++) {
			objects[i] = generator.nextInt(100);
		}
		Object[] obj = new Object[25];
		for (int i = 0; i < obj.length; i++) {
			obj[i] = (char) (generator.nextInt(26) + 'a');
		}

		AddElementToTheList firstWhichAdd = new AddElementToTheList(newList, objects);
		Thread firstAddThread = new Thread(firstWhichAdd);
		AddElementToTheList secondWhichAdd = new AddElementToTheList(newList, obj);
		Thread secondAddThread = new Thread(secondWhichAdd);

		firstAddThread.setName("First thread adds:   ");
		secondAddThread.setName("Second thread adds:  ");

		firstAddThread.start();
		secondAddThread.start();

		RemoveElementFromList firstWhichRemoves = new RemoveElementFromList(newList);
		Thread firstRemoveThread = new Thread(firstWhichRemoves);
		RemoveElementFromList secondWhichRemoves = new RemoveElementFromList(newList);
		Thread secondRemoveThread = new Thread(secondWhichRemoves);

		firstRemoveThread.setName("First thread remove: ");
		secondRemoveThread.setName("Second thread remove:");

		firstRemoveThread.start();
		secondRemoveThread.start();
	}
}
