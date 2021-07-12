package com.company.tree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
//        tree.add(8);
//        tree.add(6);
//        tree.add(9);
        tree.add(13);
//        tree.add(18);

        tree.removeNode(15);
        tree.levelOrder();
    }
}
