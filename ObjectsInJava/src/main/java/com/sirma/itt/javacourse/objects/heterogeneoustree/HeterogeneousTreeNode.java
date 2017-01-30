package com.sirma.itt.javacourse.objects.heterogeneoustree;

/**
 * ITTE-1674 Class that implements a single node in the tree.
 * 
 * @author Petar Ivanov
 */
public class HeterogeneousTreeNode {
	private Object value;
	private HeterogeneousTreeNode leftChild;
	private HeterogeneousTreeNode rightChild;

	/**
	 * Constructor of node.
	 * 
	 * @param value
	 *            Parameter constructor.
	 */
	public HeterogeneousTreeNode(final Object value) {
		this.setValue(value);
		setLeftChild(null);
		setRightChild(null);
	}

	/**
	 * Getter method for leftChild.
	 *
	 * @return the leftChild
	 */
	public final HeterogeneousTreeNode getLeftChild() {
		return leftChild;
	}

	/**
	 * Setter method for leftChild.
	 *
	 * @param leftChild
	 *            the leftChild to set
	 */
	public final void setLeftChild(HeterogeneousTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Getter method for rightChild.
	 *
	 * @return the rightChild
	 */
	public final HeterogeneousTreeNode getRightChild() {
		return rightChild;
	}

	/**
	 * Setter method for rightChild.
	 *
	 * @param rightChild
	 *            the rightChild to set
	 */
	public final void setRightChild(HeterogeneousTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * Getter method for value.
	 *
	 * @return the value
	 */
	public final Object getValue() {
		return value;
	}

	/**
	 * Setter method for value.
	 *
	 * @param value
	 *            the value to set
	 */
	public final void setValue(Object value) {
		this.value = value;
	}
}