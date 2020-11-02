import java.util.Iterator;

public class DoublyLinkedList<E> implements PositionalList<E> {

	// Node Class
	private static class Node<E> implements Position<E> {
		private E element;
		private Node<E> prev;
		private Node<E> next;

		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}

		public E getElement() throws IllegalStateException {
			if (next == null) throw new IllegalStateException("Position no longer valid");
			return element;
		}

		public Node<E> getPrev() {
			return prev;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setElement(E e) {
			element = e;
		}
		public void setPrev(Node<E> p) {
			prev = p;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}

	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;

	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}

	// Returns the position as a node
	private Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
		Node<E> node = (Node<E>) p;
		if (node.getNext() == null)
			throw new IllegalArgumentException("p is no longer in the list");
		return node;
	}

	// Returns the position of a node
	private Position<E> position(Node<E> node) {
		if (node == header || node == trailer)
			return null;
		return node;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<E> first() {
		return position(header.getNext( ));
	}

	@Override
	public Position<E> last() {
		return position(trailer.getPrev( ));
	}

	@Override
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		return position(validate(p).getPrev());
	}

	@Override
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		return position(validate(p).getNext());
	}

	// Adds element to list between the given nodes
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
	}

	@Override
	public Position<E> addFirst(E e) {
		return addBetween(e, header, header.getNext( ));
	}

	@Override
	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev( ), trailer);
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e)
			throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev( ), node);
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e)
			throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext( ));
	}

	@Override
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E answer = node.getElement( );
		node.setElement(e);
		return answer;
	}

	@Override
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev( );
		Node<E> successor = node.getNext( );
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		return answer;
	}

	// Element iterator
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			Node<E> current = validate(first());

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public E next() {
				Node<E> temp = current;
				current = current.getNext();
				return temp.getElement();
			}
		};
	}

	// Position iterator
	public Iterator<Position<E>> positionIterator() {
		return new Iterator<Position<E>>() {
			private Position<E> cursor = first( );
			private Position<E> recent = null;

			@Override
			public boolean hasNext() {
				return cursor != null;
			}

			@Override
			public Position<E> next() {
				recent = cursor;
				cursor = after(cursor);
				return recent;
			}
		};
	}

	@Override
	public Iterable<Position<E>> positions() {
		return () -> positionIterator();
	}
	
	public E removeFirst() throws IllegalArgumentException {
		return remove(first());
	}
	
	public E removeLast() throws IllegalArgumentException {
		return remove(last());
	}

}