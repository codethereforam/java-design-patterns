package priv.thinkam.dp.behavioral.iterator;

/**
 * @author thinkam
 * @date 2018/02/10
 */
public class LinkedList<T> implements Collection<T> {
	private Node head;
	private Node tail;
	private int size;

	@Override
	public boolean add(T t) {
		Node node = new Node(t, null);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = tail.next;
		}
		size++;
		return true;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<T> {
		private Node node = head;

		@Override
		public boolean hasNext() {
			return node != null;
		}

		@Override
		public T next() {
			T t = node.data;
			node = node.next;
			return t;
		}
	}

	private class Node {
		private T data;
		private Node next;

		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

		void setNext(Node next) {
			this.next = next;
		}
	}
}
