package com.sirma.itt.javacourse.collections.lru;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1826 LRU Run class.
 * 
 * @author Petar Ivanov
 */
public class RunLRU {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunLRU.class);
	private static final String FORMAT = "cache: %s";
	private static final int capacity = 3;

	/**
	 * Private constructor for utility classes.
	 */
	private RunLRU() {
	}

	/**
	 * LRU Cache instance with 3 records capacity. Puts in 'cache' three numbers. After entering the another three
	 * numbers, one of which is not present in the cache, cache subtracted least recently used one.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LRUcache<Integer, String> cache = new LRUcache<Integer, String>(capacity);
		cache.addEntry(1, "one");
		cache.addEntry(2, "two");
		cache.addEntry(3, "three");

		LOGGER.info(String.format(FORMAT, cache.printEntryes()));
		cache.addEntry(1, "one");
		cache.addEntry(2, "two");

		LOGGER.info(String.format(FORMAT, cache.printEntryes()));

		cache.addEntry(4, "four");
		LOGGER.info(String.format(FORMAT, cache.printEntryes()));
	}
}
