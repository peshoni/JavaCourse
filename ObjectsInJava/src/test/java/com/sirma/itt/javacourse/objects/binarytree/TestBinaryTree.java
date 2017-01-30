package com.sirma.itt.javacourse.objects.binarytree;



import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;
import main.java.com.sirma.itt.javacourse.intro.arraysorting.ArraySorting;

/**
 * ITTE-1673 Test class for binary tree methods.
 * 
 * @author Petar Ivanov
 */
public class TestBinaryTree {
	/**
	 * NewNode variable to add a new node in the tree - true or false.
	 */
	boolean newNode = false;
	/**
	 * New object of class BinaryTree.
	 */
	BinaryTree newTree = new BinaryTree();
	/**
	 * Array with values.
	 */
	final int[] array = { 45, 40, 35, 30, 38, 25, 28, 36, 39, 50, 55, 53, 58 };

	/**
	 * Test insert element function.
	 */
	@Test
	public final void testInsertElement() {
		final int element = 100;
		newNode = newTree.insertValue(element);
		boolean expectedFlag = true;
		Assert.assertEquals(expectedFlag, newNode);		
	}

	/**
	 * Test re-inserting element.
	 */
	@Test
	public final void testInsertExistingElement() {
		final int element = 100;
		newNode = newTree.insertValue(element);
		newNode = newTree.insertValue(element);
		boolean expectedFlag = false;
		Assert.assertEquals(expectedFlag, newNode);
		

	}

	/**
	 * Test search method with containing element in tree.
	 */
	@Test
	public final void testSearchContainingElement() {
		for (int i = 0; i < array.length; i++) {
			newTree.insertValue(array[i]);
		}
		final int search = 58;
		boolean flag = newTree.searchBinaryTree(search);
		Assert.assertTrue(flag);
	}

	/**
	 * Test search method with not containing element in tree.
	 */
	@Test
	public final void testSearchNotContainingElement() {

		for (int i = 0; i < array.length; i++) {
			newTree.insertValue(array[i]);
		}
		final int search = 10000;	
		Assert.assertFalse(newTree.searchBinaryTree(search));
	}

	/**
	 * Test print method.
	 * 
	 */
	@Test
	public final void testPrint() {
		final int[] array = { 10, 20, 5, 2, 8, 15, 30 };
		for (int i = 0; i < array.length; i++) {
			newTree.insertValue(array[i]);
		}
		String sortedArray = ArrayProcessing.printsArray(ArraySorting.quickSort(array, 0, array.length - 1));
		String sortTree = newTree.printBinaryTree();
		Assert.assertTrue(sortTree.equalsIgnoreCase(sortedArray));
	}
}
