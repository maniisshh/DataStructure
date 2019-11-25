package linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));

        System.out.println("Original LinkedList");
        printLinkedList(head.next());

        reverseLinkedList(linkedList, head);
    }

    private static void printLinkedList(LinkedList.Node head) {
        LinkedList.Node current = head;
        while (current != null) {
            System.out.print(" " + current);
            current = current.next();
        }
    }

    private static void reverseLinkedList(LinkedList linkedList, LinkedList.Node head) {
        LinkedList.Node previous = null;
        LinkedList.Node current = head.next();
        LinkedList.Node next = null;

        while (current != null) {
            next = current.next();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        head = previous;

        System.out.println("\nReversed LinkedList");
        printLinkedList(head);

    }
}
