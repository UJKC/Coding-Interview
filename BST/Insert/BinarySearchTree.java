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
    
        // If the tree is empty, place the new node as the root
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node temp = root;
    
            // Traverse the tree to find the appropriate spot
            while (true) {
                if (value == temp.value) {
                    // Value already exists in the tree, no duplicates allowed
                    return false;
                } else if (value < temp.value) {
                    // Go to the left subtree
                    if (temp.left == null) {
                        temp.left = newNode;
                        return true;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    // Go to the right subtree
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }
    

}