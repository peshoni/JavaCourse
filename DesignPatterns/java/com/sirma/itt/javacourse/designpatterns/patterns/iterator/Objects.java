package com.sirma.itt.javacourse.designpatterns.patterns.iterator;

/**
 * ITTE-1909 Iterator design pattern. Create concrete class implementing the
 * Aggregate interface. This class has inner class ObjectsIterator implementing
 * the Iterator interface.
 * 
 * @author Petar Ivanov
 */
public class Objects implements Aggregate {
	private Object[] objects;
	private int end;
	private int current;

	/**
	 * Constructor.
	 * 
	 * @param Array
	 *            with objects.
	 */
	public Objects(Object[] objects) {
		this.objects = objects;
		this.end = objects.length;
		this.current = 0;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return Iterator
	 */
	@Override
	public Iterator getIterator() {
		return new ObjectIterator();
	}

	/**
	 * Inner class implements Iterator interface.
	 * 
	 * @author Petar Ivanov
	 */
	private class ObjectIterator implements Iterator {
		/**
		 * {@inheritDoc}
		 */
		@Override
		public boolean hasNext() {
			return current < end;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Object next() {
			if (this.hasNext()) {
				return objects[current++];
			}
			return null;
		}
	}
}
