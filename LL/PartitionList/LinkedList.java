package LL.PartitionList;

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

    public void partitionList(int x) {
        Node lowHead = null; // Head of the low partition
        Node lowTail = null; // Tail of the low partition
        Node highHead = null; // Head of the high partition
        Node highTail = null; // Tail of the high partition

        Node current = head; // Start with the head of the original list

        while (current != null) {
            Node nextNode = current.next; // Store the next node before changing current

            if (current.value < x) {
                // Add to low partition
                if (lowHead == null) {
                    lowHead = current; // First element in low
                    lowTail = current; // Initialize tail to the first element
                } else {
                    lowTail.next = current; // Link to the end of low partition
                    lowTail = lowTail.next; // Update tail
                }
            } else {
                // Add to high partition
                if (highHead == null) {
                    highHead = current; // First element in high
                    highTail = current; // Initialize tail to the first element
                } else {
                    highTail.next = current; // Link to the end of high partition
                    highTail = highTail.next; // Update tail
                }
            }

            current.next = null; // Disconnect the current node from the original list
            current = nextNode; // Move to the next node
        }

        // Combine the two partitions
        if (lowTail != null) {
            head = lowHead; // Set head to low partition's head
            lowTail.next = highHead; // Connect low tail to high head
        } else {
            head = highHead; // If low is empty, head is the high partition
        }
    }

}
