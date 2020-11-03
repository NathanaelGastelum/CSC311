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
        CircularArrayQueue<String> queue1 = new CircularArrayQueue<>(4);
        queue1.enqueue("first");
        queue1.enqueue("second");
        queue1.enqueue("third");
        queue1.enqueue("fourth");

        System.out.println("\nRotate Test");
        queue1.rotate();
        while (!queue1.isEmpty()) {
            System.out.println(queue1.dequeue());
        }

        // Josephus Test, expect alice to win when k = 3, bob when k = 10
        String[] people = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
        DoublyLinkedList<String> result = Josephus.order(people, 3);
        System.out.println("\nWinner: " + result.last().getElement());
        result = Josephus.order(people, 10);
        System.out.println("Winner: " + result.last().getElement());
    }
}