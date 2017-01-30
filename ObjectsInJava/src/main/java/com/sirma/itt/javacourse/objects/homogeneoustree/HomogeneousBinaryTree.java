package com.sirma.itt.javacourse.objects.homogeneoustree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1672 Homogeneous tree. Class creates homogeneous treeq which element are the same type and random attributes.
 * 
 * @param <T>Generic
 *            type for declaring element's type.
 * @author Petar Ivanov
 */
public class HomogeneousBinaryTree<T> {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomogeneousBinaryTree.class);
	private HomogeneousBinaryTreeNode<T> root;

	/**
	 * Constructor for the tree.
	 * 
	 * @param value
	 *            The value of the root
	 */
	public HomogeneousBinaryTree(final T value) {
		root = new HomogeneousBinaryTreeNode<T>(value);
	}

	/**
	 * Get method
	 * 
	 * @return the root of the tree
	 */
	public HomogeneousBinaryTreeNode<T> getRoot() {
		return root;
	}

	/**
	 * Method for inesert value in the tree.
	 * 
	 * @param value
	 *            Inserted value.
	 */
	public final void insertValue(final T value) {
		this.root = insert(value, root);
	}

	/**
	 * Implementation of the insert function. Adding an item after comparing their hash codes.
	 * 
	 * @param value
	 *            Inserted value.
	 * @param currentNode
	 *            Current unit to insert value.
	 * @return New tree node
	 */

	private HomogeneousBinaryTreeNode<T> insert(T value, HomogeneousBinaryTreeNode<T> currentNode) {
		HomogeneousBinaryTreeNode<T> node = currentNode;
		if (node == null) {
			node = new HomogeneousBinaryTreeNode<T>(value);
		} else {
			if (value.hashCode() > node.getValue().hashCode()) {
				node.setRightChild(insert(value, node.getRightChild()));
			} else if (value.hashCode() < node.getValue().hashCode()) {
				node.setLeftChild(insert(value, node.getLeftChild()));
			} else {
				LOGGER.info(String.valueOf(value) + " value already exist!");
			}
		}
		return node;
	}

	/**
	 * Print tree method.
	 * 
	 * @return String with sorted tree.
	 */
	public final String printHomogeneousBinaryTree() {
		return printHomogeneousBinaryTree(this.root);
	}

	/**
	 * Implementation of print function.
	 * 
	 * @param curremtnode
	 *            Current unit for visiting.
	 * @return String with sorted elements.
	 */
	private String printHomogeneousBinaryTree(final HomogeneousBinaryTreeNode<T> currentNode) {
		HomogeneousBinaryTreeNode<T> node = currentNode;
		StringBuilder builder = new StringBuilder();
		if (node.getLeftChild() != null) {
			builder.append(printHomogeneousBinaryTree(node.getLeftChild()));
		}
		builder.append(node.getValue());
		builder.append(" ");
		if (node.getRightChild() != null) {
			builder.append(printHomogeneousBinaryTree(node.getRightChild()));
		}
		return builder.toString();
	}
}
