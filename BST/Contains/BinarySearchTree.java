public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }
    
	public Node getRoot() {
        return root;
    }
    
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

	public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        else if (root.value == value) {
            return true;
        }
        else {
            Node temp = root;
            while (true) { 
                if (temp.value == value) {
                    return true;
                }
                else if (value < temp.value) {
                    if (temp.left == null) {
                        return false;
                    }
                    else {
                        temp = temp.left;
                    }
                }
                else {
                    if (temp.right == null) {
                        return false;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

}