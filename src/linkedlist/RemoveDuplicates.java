package linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));
        linkedList.add(new LinkedList.Node("5"));

        System.out.println("Original LinkedList");
        printLinkedList(head.next());

        removeDuplicates(head);
    }

    private static void removeDuplicates(LinkedList.Node head) {
        LinkedList.Node previous = null, current = head;
        HashSet<String> hsNodes = new HashSet<>();
        while (current != null) {
            String currentVal = current.toString();
            if (hsNodes.contains(currentVal)) {
                previous.setNext(current.next());
            } else {
                hsNodes.add(currentVal);
                previous = current;
            }
            current = current.next();
        }

        System.out.println("\n Modified LinkedList");
        printLinkedList(head.next());
    }

    private static void printLinkedList(LinkedList.Node head) {
        LinkedList.Node current = head;
        while (current != null) {
            System.out.print(" " + current);
            current = current.next();
        }
    }
}
