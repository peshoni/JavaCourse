package com.sirma.itt.javacourse.objects.binarytree;

/**
 * ITTE-1673 Class that creates a node in the tree with the two successor.
 * 
 * @author Petar Ivanov
 */
public class BinaryNode {
	private int value;
	private BinaryNode leftChild;
	private BinaryNode rightChild;

	/**
	 * Constructs node of the binary tree.
	 * 
	 * @param value
	 *            To be inserted.
	 */
	public BinaryNode(final int value) {
		this.setValue(value);
		setLeftChild(null);
		setRightChild(null);

	}

	/**
	 * Getter method for value.
	 *
	 * @return the value
	 */
	public final int getValue() {
		return value;
	}

	/**
	 * Setter method for value.
	 *
	 * @param value
	 *            the value to set
	 */
	public final void setValue(final int value) {
		this.value = value;
	}

	/**
	 * Getter method for leftChild.
	 *
	 * @return the leftChild
	 */
	public BinaryNode getLeftChild() {
		return leftChild;
	}

	/**
	 * Setter method for leftChild.
	 *
	 * @param leftChild
	 *            the leftChild to set
	 */
	public final void setLeftChild(final BinaryNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Getter method for rightChild.
	 *
	 * @return the rightChild
	 */
	public final BinaryNode getRightChild() {
		return rightChild;
	}

	/**
	 * Setter method for rightChild.
	 *
	 * @param rightChild
	 *            the rightChild to set
	 */
	public final void setRightChild(final BinaryNode rightChild) {
		this.rightChild = rightChild;
	}
}
