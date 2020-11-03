import java.util.Iterator;

public class Main{
    /**
     * @param args
     * */
    public static void main(String[] args) {

        // DoublyLinkedList test
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();
        dll.addLast("first");
        dll.addLast("second");
        dll.addLast("third");
        dll.addLast("fourth");

        // Element iterator test
        System.out.println("\nElement Iterator Test");
        Iterator<String> iterator = dll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Positions test
        System.out.println("\nPositions Test");
        Iterable<Position<String>> iterable = dll.positions();
        for (Position<String> p : iterable) {
            System.out.println(p.getElement());
        }

        // CircularArrayQueue Test
        CircularArrayQueue<String> queue = new CircularArrayQueue<>(4);
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.enqueue("fourth");

        System.out.println("\nQueue Test");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }



}