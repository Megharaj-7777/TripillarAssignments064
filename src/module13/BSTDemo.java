package module13;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTDemo {

    Node root;

    // Insert
    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    // Search
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // Find Min
    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // Find Max
    int findMax(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    // Delete
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // Inorder (for display)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Check BST
    boolean isBST(Node node, int min, int max) {
        if (node == null) return true;

        if (node.data <= min || node.data >= max)
            return false;

        return isBST(node.left, min, node.data) &&
               isBST(node.right, node.data, max);
    }

    public static void main(String[] args) {
        BSTDemo tree = new BSTDemo();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values)
            tree.root = tree.insert(tree.root, v);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));
        System.out.println("Min: " + tree.findMin(tree.root));
        System.out.println("Max: " + tree.findMax(tree.root));

        tree.root = tree.delete(tree.root, 20);
        System.out.print("After Deletion: ");
        tree.inorder(tree.root);

        System.out.println("\nIs Valid BST: " +
            tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}