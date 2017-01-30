package com.sirma.itt.javacourse.objects.homogeneoustree;

/**
 * ITTE-1672 Class that creates a single node of binary tree.
 * 
 * @param <T>
 *            Generic type for declaring element's type.
 * @author Petar Ivanov
 */
public class HomogeneousBinaryTreeNode<T> {
	private T value;
	private HomogeneousBinaryTreeNode<T> leftChild;
	private HomogeneousBinaryTreeNode<T> rightChild;

	/**
	 * Constructor of node.
	 * 
	 * @param value
	 *            Parameter constructor
	 */
	public HomogeneousBinaryTreeNode(final T value) {
		this.setValue(value);
		setLeftChild(null);
		setRightChild(null);
	}

	/**
	 * Getter method for value.
	 *
	 * @return the value
	 */
	public final T getValue() {
		return value;
	}

	/**
	 * Setter method for value.
	 *
	 * @param value
	 *            the value to set
	 */
	public final void setValue(T value) {
		this.value = value;
	}

	/**
	 * Getter method for leftChild.
	 *
	 * @return the leftChild
	 */
	public final HomogeneousBinaryTreeNode<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * Setter method for leftChild.
	 *
	 * @param leftChild
	 *            the leftChild to set
	 */
	public final void setLeftChild(final HomogeneousBinaryTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Getter method for rightChild.
	 *
	 * @return the rightChild
	 */
	public final HomogeneousBinaryTreeNode<T> getRightChild() {
		return rightChild;
	}

	/**
	 * Setter method for rightChild.
	 *
	 * @param rightChild
	 *            the rightChild to set
	 */
	public final void setRightChild(final HomogeneousBinaryTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

}
