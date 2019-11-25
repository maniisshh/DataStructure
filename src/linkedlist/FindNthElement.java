package linkedlist;

public class FindNthElement {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();

        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));
        linkedList.add(new LinkedList.Node("6"));
        linkedList.add(new LinkedList.Node("7"));
        linkedList.add(new LinkedList.Node("8"));

        findNthItemFromEnd2(linkedList, head, 3);
    }

    /**
     * Method 2 (Use two pointers)
     *
     * @param linkedList
     * @param head
     * @param n
     */
    private static void findNthItemFromEnd2(LinkedList linkedList, LinkedList.Node head, int n) {
        LinkedList.Node current = head;
        LinkedList.Node nth = head;
        int length = 0;

        while (current.next() != null) {
            length++;
            if (length >= n) {
                nth = nth.next();
            }
            current = current.next();
        }

        System.out.println("3rd Element form end is :" + nth);
    }

    /**
     * Method 1 (Use length of linked list)
     *
     * @param linkedList
     * @param head
     */
    private static void findNthItemFromEnd(LinkedList linkedList, LinkedList.Node head, int n) {
        LinkedList.Node current = head;
        int length = 0;

        while (current.next() != null) {
            current = current.next();
            length++;
        }

        current = head;
        for (int i = 0; i < length - 3 + 1; i++) {
            current = current.next();
        }

        System.out.println("3rd Element form end is :" + current);
    }
}
