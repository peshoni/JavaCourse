package com.sirma.itt.javacourse.objects.heterogeneoustree;

/**
 * ITTE-1674 A realization of heterogeneous tree for all objects. It has implemented methods for inserting, printing all
 * the elements sorting them by their class types.
 * 
 * 
 * @author Petar Ivanov
 */
public class HeterogeneousTree {
	private HeterogeneousTreeNode root;

	/**
	 * Constructor.
	 */
	public HeterogeneousTree() {
		this.root = null;
	}

	/**
	 * Insert value in the tree.
	 * 
	 * @param value
	 *            Value for inserting.
	 * @return Value
	 */
	public Object insertValue(Object value) {
		this.root = insertValue(value, root);
		return value;
	}

	/**
	 * Implementation of the insertValue function. First entered data type is placed in the left subtree and other types
	 * go to the right.
	 * 
	 * @param value
	 *            - Value for inserting.
	 * @param currentNode
	 *            Node for checking.
	 * @return Node Created node
	 */

	private HeterogeneousTreeNode insertValue(Object value, HeterogeneousTreeNode currentNode) {
		HeterogeneousTreeNode node = currentNode;
		if (node == null) {
			node = new HeterogeneousTreeNode(value);
		} else {
			if (node.getValue().getClass() == value.getClass()) {
				node.setLeftChild(insertValue(value, node.getLeftChild()));
			} else if (node.getValue().getClass() != value.getClass()) {
				node.setRightChild(insertValue(value, node.getRightChild()));
			}
		}
		return node;
	}

	/**
	 * Prints objects in the tree sorted in the order of data types.
	 * 
	 * @return Sorted string
	 */
	public String printTree() {
		return printTree(this.root);
	}

	/**
	 * Implementation of the print method.
	 * 
	 * @param root
	 *            Root for print.
	 * @return String with structure.
	 */
	private String printTree(HeterogeneousTreeNode root) {
		StringBuilder builder = new StringBuilder();
		if (root.getLeftChild() != null) {
			builder.append(printTree(root.getLeftChild()));
		}
		builder.append(root.getValue());
		builder.append(" ");
		if (root.getRightChild() != null) {
			builder.append(printTree(root.getRightChild()));
		}
		return builder.toString();
	}
}
