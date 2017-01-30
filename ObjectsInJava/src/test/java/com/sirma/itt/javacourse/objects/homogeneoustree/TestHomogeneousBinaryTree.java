package com.sirma.itt.javacourse.objects.homogeneoustree;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1672 TestHomogeneousBinaryTree class.
 * 
 * @author Petar Ivanov
 */
public class TestHomogeneousBinaryTree {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestHomogeneousBinaryTree.class);
	final String[] array = { "Petar", "Angel", "Georgi", "Tihomir" };
	HomogeneousBinaryTree<String> tree = new HomogeneousBinaryTree<String>("New_tree");

	@Test
	public final void testInsertElements() {
		for (int i = 0; i < array.length; i++) {
			tree.insertValue(array[i]);
		}
		final String string = "Angel Petar Tihomir New_tree Georgi ";
		Assert.assertEquals(string, tree.printHomogeneousBinaryTree());
		LOGGER.info(tree.printHomogeneousBinaryTree());
	}
}
