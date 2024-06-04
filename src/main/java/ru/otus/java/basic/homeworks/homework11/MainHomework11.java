package ru.otus.java.basic.homeworks.homework11;


import ru.otus.java.basic.homeworks.homework11.binarytree.BinarySearchTree;
import ru.otus.java.basic.homeworks.homework11.binarytree.BinaryTreePrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainHomework11 {
    public static void main(String[] args) {
        int[] array = new int[] {0,13,8,5,3,2,1,1,21};
        //SortArray.bubbleSort(array);
        SortArray.quickSort(array, 0, array.length - 1);
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        PersonDataBase persons = new PersonDataBase();
        Person p1 = new Person("Nick",Position.ENGINEER,406202401L);
        Person p2 = new Person("Anna",Position.SENIOR_MANAGER,406202402L);

        persons.add(p1);
        persons.add(p2);

        System.out.println(persons.findById(406202401L));
        System.out.println(persons.isManager(p2));
        System.out.println(persons.isEmployee(406202401L));


        /* HARD - Binary tree */
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
