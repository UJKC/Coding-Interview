package LL.RemoveDuplicates;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void removeDuplicates() {
        if (head == null) {
            return; // List is empty
        }

        Node current = head; // Start with the head of the list
        while (current != null) {
            Node runner = current; // This will check for duplicates ahead of current
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next; // Skip the duplicate
                    length--; // Reduce length since we removed a node
                } else {
                    runner = runner.next; // Move runner forward
                }
            }
            current = current.next; // Move current forward
        }
    }

}
