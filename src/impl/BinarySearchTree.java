package impl;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        this.root = insert(this.root, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value, null, null);
        }

        if (value > node.getValue()) {
            node.setRight(insert(node.getLeft(), value));
        } else if (value < node.getValue()) {
            node.setLeft(insert(node.getRight(), value));
        } else {
            return node; // value already exist
        }

        return node;
    }

    public void delete(int value) {
        this.root = delete(this.root, value);
    }

    private TreeNode delete(TreeNode node, int value) {
        if (node == null) {
            return null;
        }

        if (value > node.getValue()) {
            node.setRight(delete(node.getRight(), value));
        } else if(value < node.getValue()) {
            node.setLeft(delete(node.getLeft(), value));
        } else {

        }

        return node;
    }

    public boolean isEmpty() {
        return this.root == null;
    }
}
