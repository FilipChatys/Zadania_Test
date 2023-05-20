import java.util.NoSuchElementException;

public class MetodaTree_Do_Zad2 {

    static class Tree {
        static class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {
                this.value = value;
                left = null;
                right = null;
            }
        }

        Node root;

        public Tree() {
            root = null;
        }

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }

            if (value <= current.value) {
                current.left = addRecursive(current.left, value);
            } else {
                current.right = addRecursive(current.right, value);
            }

            return current;
        }

        public boolean contains(int value) {
            return containsRecursive(root, value);
        }

        private boolean containsRecursive(Node current, int value) {
            if (current == null) {
                return false;
            }

            if (value == current.value) {
                return true;
            }

            if (value < current.value) {
                return containsRecursive(current.left, value);
            } else {
                return containsRecursive(current.right, value);
            }
        }

        public int min() {
            if (root == null) {
                throw new NoSuchElementException("Tree is empty");
            }

            return findMin(root);
        }

        private int findMin(Node node) {
            if (node.left == null) {
                return node.value;
            }

            return findMin(node.left);
        }

        public int max() {
            if (root == null) {
                throw new NoSuchElementException("Tree is empty");
            }

            return findMax(root);
        }

        private int findMax(Node node) {
            if (node.right == null) {
                return node.value;
            }

            return findMax(node.right);
        }

        public void printTree() {
            printInorder(root);
        }

        private void printInorder(Node node) {
            if (node == null) {
                return;
            }

            printInorder(node.left);
            System.out.print(node.value + " ");
            printInorder(node.right);
        }
    }
}
