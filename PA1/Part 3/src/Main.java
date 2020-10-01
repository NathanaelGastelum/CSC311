public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(5);
        list.add(10, 1);
        list.add(3, 2);
        list.add(15, 3);

        System.out.println(list.toString());
        list.add(7, 2);
        System.out.println(list.toString());

        list.reverseList();
        System.out.println(list.toString());
    }
}
