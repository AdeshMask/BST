package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        System.out.println();
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(3);
        bst.insert(95);
        bst.insert(11);
        bst.insert(16);
        bst.insert(2);
        bst.insert(40);
        bst.insert(60);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);
        bst.display();
        System.out.println();
        System.out.println("The size of BST:"+bst.size());
    }
}
