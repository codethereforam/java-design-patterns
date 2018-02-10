package priv.thinkam.dp.behavioral.iterator;

/**
 * @author thinkam
 * @date 2018/02/10
 */
public class ArrayList<T> implements Collection<T> {
	private static final Object[] EMPTY_ELEMENTDATA = {};
	private Object[] elementData;
	private int size;

	public ArrayList() {
		this(0);
	}

	public ArrayList(int initialCapacity) {
		if (initialCapacity == 0) {
			elementData = EMPTY_ELEMENTDATA;
		} else if (initialCapacity > 0) {
			elementData = new Object[initialCapacity];
		} else {
			throw new IllegalArgumentException("illegal capcity:" + initialCapacity);
		}
	}

	@Override
	public boolean add(T t) {
		if (this.size == elementData.length) {
			Object[] newElementData = new Object[elementData.length + 10];
			System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
			elementData = newElementData;
		}
		this.elementData[size++] = t;
		return true;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}

	private class ArrayListIterator implements Iterator<T> {
		private int index;

		@Override
		public boolean hasNext() {
			return index < size;
		}

		@Override
		public T next() {
			return (T) elementData[index++];
		}
	}
}
