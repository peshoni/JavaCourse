package com.sirma.itt.javacourse.objects.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1673 Binary tree class implemented methods for inserting, searching element and printing all.
 * 
 * @author Petar Ivanov
 */
public class BinaryTree {
	private static final Logger LOGGER = LoggerFactory.getLogger(BinaryTree.class);
	private BinaryNode root;
	/**
	 * Successful or not adding a node in the tree.
	 */
	private boolean newNode = true;

	/**
	 * Constructor of tree.
	 */
	public BinaryTree() {
		this.root = null;
	}

	/**
	 * Method for inserting value in tree.
	 * 
	 * @param value
	 *            Inserted value
	 * @return Successful or not added
	 */
	public final boolean insertValue(final int value) {
		this.root = insert(value, root);
		return newNode;
	}

	/**
	 * Implementation of the insert function.
	 * 
	 * @param value
	 *            Inserted value.
	 * @param currentNode
	 *            Current unit to insert value.
	 * @return New tree node
	 */
	private BinaryNode insert(final int value, BinaryNode currentNode) {
		BinaryNode node = currentNode;
		if (node == null) {
			node = new BinaryNode(value);
		} else {
			if (value > node.getValue()) {
				node.setRightChild(insert(value, node.getRightChild()));
			} else if (value < node.getValue()) {
				node.setLeftChild(insert(value, node.getLeftChild()));
			} else {
				newNode = false;
				LOGGER.info(String.valueOf(value) + " value already exist!");
			}
		}
		return node;
	}

	/**
	 * Method that prints element of the three in ascending order.
	 * 
	 * @return Sorted elements to string.
	 */
	public final String printBinaryTree() {
		return printBinaryTree(this.root);
	}

	/**
	 * Implementation of print function.
	 * 
	 * @param currentNode
	 *            Current unit for visiting.
	 * @return String with sorted elements.
	 */
	private String printBinaryTree(final BinaryNode currentNode) {
		BinaryNode node = currentNode;
		StringBuilder builder = new StringBuilder();
		if (node.getLeftChild() != null) {
			builder.append(printBinaryTree(node.getLeftChild()));
		}
		builder.append(node.getValue());
		builder.append(" ");
		if (node.getRightChild() != null) {
			builder.append(printBinaryTree(node.getRightChild()));
		}
		return builder.toString();
	}

	/**
	 * Search element in binary tree.
	 * 
	 * @param value
	 *            Value for searching
	 * @return true or false
	 */
	public final boolean searchBinaryTree(final int value) {
		return searchBinaryTree(this.root, value);
	}

	/**
	 * Implementation of search function.
	 * 
	 * @param currentNode
	 *            Current unit to search for value
	 * @param value
	 *            Value for searching
	 * @return Result of searching - true or false
	 */
	private boolean searchBinaryTree(final BinaryNode currentNode, final int value) {
		BinaryNode node = currentNode;
		if (value == node.getValue()) {
			return true;
		}
		if ((value > node.getValue()) && (node.getRightChild() != null)) {
			return searchBinaryTree(node.getRightChild(), value);
		} else if ((value < node.getValue()) && (node.getLeftChild() != null)) {
			return searchBinaryTree(node.getLeftChild(), value);
		}
		return false;
	}
}
