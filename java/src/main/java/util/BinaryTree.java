package main.java.util;

public class BinaryTree {
    private Node root;

    // TODO: Add functionality seems to be broken......
    public void add(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public void add(int data) {
        if (this.root == null) {
            this.root = new Node(null, data, null);
        } else {
            add(this.root, data);
        }
    }

    private void add(Node node, int data) {
        // left_subtree (keys)  ≤  node (key)  ≤  right_subtree (keys)
        if (data > node.data) {
            if (node.right == null) {
                node.right = new Node(null, data, null);
            } else {
                add(node.right, data);
            }
        } else if (data < node.data) {
            if (node.left == null) {
                node.left = new Node(null, data, null);
            } else {
                add(node.left, data);
            }
        }
    }

    public int count(){
        return count(this.root.left) + 1 + count(this.root.right);
    }

    private int count(Node node){
        if(node == null){
            return 0;
        }else{
            return count(node.left) + 1 + count(node.right);
        }
    }

    @Override
    public String toString() {
        return toString(this.root);
    }

    private String toString(Node node) {
        if (node == null) {
            return null;
        }
        return "[" + toString(node.left) + "," + node.data + "," + toString(node.right) + "]";
    }

    private static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(Node left, int data, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}


