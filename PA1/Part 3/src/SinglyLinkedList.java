public class SinglyLinkedList {
    private class Node {
        public int item;
        public Node next;
        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    private Node first;
    public void addFirst(int a) {
        first = new Node(a, first);
    }

    public void add(int item, int position) {

        Node currentNode = first;

        if (position == 0) {
            Node newNode = new Node(item, first);
            first = newNode;
        }
        else {
            for (int i = 0; i < position - 1; i++) {
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
            }
            Node newNode = new Node(item, currentNode.next);
            currentNode.next = newNode;
        }
    }

    public void reverseList() {
        Node previousNode = null;
        Node currentNode = first;
        Node nextNode = first;
        while (currentNode != null) {
            nextNode = nextNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        first = previousNode;
    }

    public String toString() {
        StringBuilder list = new StringBuilder();

        Node currentNode = first;

        while (currentNode != null) {
            list.append(currentNode.item + " ");
            currentNode = currentNode.next;
        }
        return list.toString();
    }
}
