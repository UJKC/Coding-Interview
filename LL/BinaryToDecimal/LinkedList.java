package LL.BinaryToDecimal;

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
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
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

    public int binaryToDecimal() {
        if (length == 0 || head == null) {
            return 0;
        }
        else if (length == 1) {
            return head.value;
        }
        else {
            int temp_length = length;
            Node temp = head;
            int returner = 0;
            while (temp != null) {
                returner += temp.value * Math.pow(2, temp_length - 1);
                temp = temp.next;
                temp_length--;
            }
            return returner;
        }
    }

}


