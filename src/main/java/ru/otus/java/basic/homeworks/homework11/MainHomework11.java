package ru.otus.java.basic.homeworks.homework11;


import ru.otus.java.basic.homeworks.homework11.binarytree.BinarySearchTree;
import ru.otus.java.basic.homeworks.homework11.binarytree.BinaryTreePrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainHomework11 {
    public static void main(String[] args) {



        /*** HARD - Binary tree ***/
        List<Integer> list = new ArrayList<>(Arrays.asList(10,5,17,3,19,7,12,1));
        BinarySearchTree tree = new BinarySearchTree(list);
        tree.doInsert(-1);
        tree.doInsert(22);
        tree.doInsert(11);
        tree.doInsert(9);
        BinaryTreePrinter.printTree(tree);

        tree = tree.balance();
        BinaryTreePrinter.printTree(tree);
    }
}
