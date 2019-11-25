package linkedlist;

import java.util.HashSet;

public class DetectLoop {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));
        linkedList.add(new LinkedList.Node("6"));

        //creating loop
        head.next().next().next().next().next().next().setNext(head.next().next());

        if (detectLoop2(linkedList, head)) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop Detected");
        }
    }

    /**
     * Method to find loop in given linked list using hash set
     *
     * @param linkedList
     * @param head
     */
    private static boolean detectLoop(LinkedList linkedList, LinkedList.Node head) {
        HashSet<LinkedList.Node> set = new HashSet<>();
        while (head.next() != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next();
        }
        return false;
    }

    /**
     * Method to find loop in given linked list by floyed cycle or fast/slow algorithm
     *
     * @param linkedList
     * @param head
     */
    private static boolean detectLoop2(LinkedList linkedList, LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while (slow.next() != null && fast.next() != null) {
            slow = slow.next();
            fast = fast.next().next();

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
