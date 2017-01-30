package com.sirma.itt.javacourse.designpatterns.patterns.objectpool;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1952 Object pool. Pool class reserving a number of instances.
 * 
 * @author Petar Ivanov
 */
public class Pool {
	private static final Logger LOGGER = LoggerFactory.getLogger(Pool.class);
	private ArrayList<CustomClass> list;
	private int limit;
	private int current;

	/**
	 * Constructs pool with given size.
	 * 
	 * @param limit
	 */
	public Pool(int limit) {
		list = new ArrayList<CustomClass>();
		this.limit = limit;
		this.current = 0;
	}

	/**
	 * Acquires an object from the pool.
	 * 
	 * @return Instance of {@link CustomClass}
	 */
	public CustomClass acquire() {
		if (current < limit) {
			list.add(new CustomClass());
			return list.get(current++);
		} else if (current == limit) {
			LOGGER.info("No available recources.");
		}
		return null;
	}

	/**
	 * Excludes instance of {@link CustomClass} from list.
	 * 
	 * @param release
	 *            Instance of {@link CustomClass}
	 * @return boolean result from releasing.
	 */
	public boolean release(CustomClass release) {
		if (list.remove(release)) {
			current--;
			LOGGER.info("Recource is released.");
			return true;
		} else {
			LOGGER.info("This instance is not already in the pool.");
		}
		return false;
	}
}
