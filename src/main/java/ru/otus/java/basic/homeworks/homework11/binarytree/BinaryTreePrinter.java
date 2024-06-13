package ru.otus.java.basic.homeworks.homework11.binarytree;

import java.util.Stack;

public class BinaryTreePrinter {
    public static void printTree(BinarySearchTree tree) {
        Stack globalStack = new Stack();
        globalStack.push(tree.getRoot());

        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";

        System.out.println(separator);

        while (!isRowEmpty) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++) {
                System.out.print(' ');
            }
            while (!globalStack.isEmpty()) {
                TreeNode temp = (TreeNode) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null || temp.getRightChild() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            gaps /= 2;
            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }
        }

        System.out.println(separator);
    }
}
