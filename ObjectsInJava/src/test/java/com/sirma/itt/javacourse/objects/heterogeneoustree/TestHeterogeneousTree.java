package com.sirma.itt.javacourse.objects.heterogeneoustree;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1674 Test Heterogeneous tree class
 * 
 * @author Petar Ivanov
 */
public class TestHeterogeneousTree {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestHeterogeneousTree.class);

	/**
	 * Tests insert method.
	 */
	@Test
	public final void insertElementsTest() {
		HeterogeneousTree tree = new HeterogeneousTree();
		final int[] array = { 100, 200 };
		tree.insertValue(array[0]);
		tree.insertValue(array[1]);

		String expected = "200 100 ";
		LOGGER.info(tree.printTree());
		Assert.assertTrue(expected.equals(tree.printTree()));
	}

	/**
	 * Tests printTree method.
	 */
	@Test
	public final void test() {
		HeterogeneousTree tree = new HeterogeneousTree();
		final int[] array = { 20, 25, 30 };
		final float[] arrayTwo = { 10.25f, 25.38f };
		tree.insertValue(array[0]);
		tree.insertValue(array[1]);
		tree.insertValue("Nikolai");
		tree.insertValue(arrayTwo[0]);
		tree.insertValue(array[2]);
		tree.insertValue("Stanislav");
		tree.insertValue(arrayTwo[1]);

		String expected = "30 25 20 Stanislav Nikolai 25.38 10.25 ";
		LOGGER.info(tree.printTree());
		Assert.assertTrue(expected.equals(tree.printTree()));
	}
}
