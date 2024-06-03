package ru.otus.java.basic.homeworks.homework11.binarytree;

import java.util.List;

public interface SearchTree<T> {
    T find(T element, TreeNode node);

    List<T> getSortedList(List<Integer> list);
}
