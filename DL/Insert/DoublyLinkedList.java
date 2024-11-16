package DL.Insert;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

	public boolean insert(int index, int value) {
        Node newNode = new Node(value);
    
        // Valid indices are 0 through length (for inserting at the end)
        if (index < 0 || index > length) {
            return false; // Invalid index
        }
    
        if (head == null) {
            // Inserting into an empty list
            head = newNode;
            tail = newNode;
            length++;
            return true;
        } else if (index == 0) {
            // Insert at the head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            length++;
            return true;
        } else if (index == length) {
            // Insert at the tail (end of the list)
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            length++;
            return true;
        } else {
            // Insert in the middle
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next; // Move to the desired index
            }
    
            Node post = temp; // This is the node at the specified index
            Node prevNode = post.prev; // Get the previous node
    
            // Update pointers
            prevNode.next = newNode; // Link previous node to new node
            newNode.prev = prevNode; // Set new node's previous to the previous node
            newNode.next = post; // Link new node to the current node at index
            post.prev = newNode; // Set the current node's previous to the new node
    
            length++;
            return true;
        }
    }
    

}