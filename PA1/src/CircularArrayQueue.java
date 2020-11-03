/**
 * 
 */


/**
 * @author Ash J
 * @param <E>
 *
 */

public class CircularArrayQueue<E> implements Queue<E> {

	private E[] data;
	private int front = 0;
	private int size = 0;

	public CircularArrayQueue(int queueSize) {
		data = (E[]) new Object[queueSize];
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	// Inserts an element at the end of the queue
	@Override
	public void enqueue(E e) {
		if (size == data.length) throw new IllegalStateException("Queue is full");
		int avail = (front + size) % data.length;
		data[avail] = e;
		size++;
	}

	@Override
	public E first() {
		if (isEmpty()) return null;
		return data[front];
	}

	// Removes and returns the first element of the queue
	@Override
	public E dequeue() {
		if (isEmpty()) return null;
		E answer = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size--;
		return answer;
	}

	// Rotates the front element of the queue to the back of the queue.
	public void rotate() {
		if (!isEmpty()) {
			enqueue(dequeue());
		}
	}
}