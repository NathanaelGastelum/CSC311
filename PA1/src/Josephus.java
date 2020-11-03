
public class Josephus {
	/**
	 * All persons sit in a circle. When we go around the circle, initially starting
	 * from the first person, then the second person, then the third... 
	 * we count 1,2,3,.., k-1. The next person, that is the k-th person is out. 
	 * Then we restart the counting from the next person, go around, the k-th person 
	 * is out. Keep going the same way, when there is only one person left, she/he 
	 * is the winner. 
	 *  
	 * @parameter persons  an array of string which contains all player names.
	 * @parameter k  an integer specifying the k-th person will be kicked out of the game
	 * @return return a doubly linked list in the order when the players were out of the game. 
	 *         the last one in the list is the winner.  
	 */
	public static DoublyLinkedList<String> order(String[] persons, int k) {
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		CircularArrayQueue<String> queue = new CircularArrayQueue<>(persons.length);
		for (String s : persons) {
			queue.enqueue(s);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				queue.rotate();
			}
			list.addLast(queue.dequeue());
		}
		return list;
	}	
}
