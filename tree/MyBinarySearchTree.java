package com.company.tree;

import com.company.myQueue.MyQueue;

public class MyBinarySearchTree {
    private Node root;
    private Node parent = null;

    public void add(Integer val) {
        root = addRecursion(root, val);
    }

    private Node addRecursion(Node current, Integer val) {
        if (current == null) {
            return new Node(val);
        }
        if (current.value > val) {
            current.left = addRecursion(current.left, val);
        }
        if (current.value < val) {
            current.right = addRecursion(current.right, val);
        }
        return current;
    }

    private boolean contains(Integer val) {
        return find(root, val) != null;
    }

    public Node find(Integer val) {
        return find(root, val);
    }

    private Node find(Node current, Integer val) {
        if (current == null) {
            return null;
        }
        if (current.value.equals(val)) {
            return current;
        }
        if (current.value > val) {
            return find(current.left, val);
        }
        return find(current.right, val);
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node current) {
        if (current != null) {
            inorder(current.left);
            System.out.println(current.value + " ");
            inorder(current.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node current) {
        if (current != null) {
            System.out.println(current.value + " ");
            preorder(current.left);
            preorder(current.right);
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node current) {
        if (current != null) {
            postorder(current.left);
            postorder(current.right);
            System.out.println(current.value + " ");
        }
    }

    public int minValue() {
        Node node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    public int maxValue() {
        Node node = root;
        while (node.right != null) {
            node = node.right;
        }
        return node.value;
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node head) {
        MyQueue<Node> myQueue = new MyQueue<>();
        myQueue.push(head);
        while (!myQueue.isEmpty()) {
            Node temp = myQueue.pop();
            System.out.print(temp.value + " ");
            if (temp.left != null) {
                myQueue.push(temp.left);
            }
            if (temp.right != null) {
                myQueue.push(temp.right);
            }
        }
    }

    public int nodeHeight(Integer val) {
        return nodeHeight(find(val));
    }

    private int nodeHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = nodeHeight(node.left);
        int rightHeight = nodeHeight(node.right);

        if (rightHeight <= leftHeight) {
            return 1 + leftHeight;
        } else {
            return 1 + rightHeight;
        }
    }

    public void removeNode(Integer val) {
        if (contains(val)) {
            removeNode(find(val));
        } else {
            throw new IllegalArgumentException("There are no that value");
        }
    }

    private void removeNode(Node removableNode) {

        if (!removableNode.equals(root)) {
            parent = findParent(root, removableNode.value);
        }

        if (removableNode.right == null) {
            if (parent == null) {
                root = removableNode.left;
            } else if (parent.value > removableNode.value) {
                parent.left = removableNode.left;
            } else {
                parent.right = removableNode.left;
            }
        } else if (removableNode.right.left == null) {
            removableNode.right.left = removableNode.left;

            if (parent == null) {
                root = removableNode.right;
            } else if (parent.value > removableNode.value) {
                parent.left = removableNode.right;
            } else {
                parent.right = removableNode.right;
            }
        } else {
            Node min = removableNode.right.left;
            Node minParent = removableNode.right;

            while (min.left != null) {
                minParent = min;
                min = min.left;
            }
            minParent.left = min.right;
            min.left = removableNode.left;
            min.right = removableNode.right;

            if (parent == null) {
                root = min;
            } else if (removableNode.value < parent.value) {
                parent.left = min;
            } else {
                parent.right = min;
            }
        }
    }

    private Node findParent(Node root, Integer val) {

        if (root.value.equals(val)) {
            return parent;
        }
        parent = root;
        if (root.value > val) {
            return findParent(root.left, val);
        }

        return findParent(root.right, val);
    }


    @Override
    public String toString() {
        return "MyBinarySearchTree{" +
                "root = " + root +
                '}';
    }
}
