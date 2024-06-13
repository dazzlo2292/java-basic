package ru.otus.java.basic.homeworks.homework11.binarytree;

import java.util.*;

public class BinarySearchTree implements SearchTree<Integer> {
    private TreeNode root;
    public final LinkedList<TreeNode> tempStack = new LinkedList<>();

    public BinarySearchTree(List<Integer> initList) {
        List<Integer> list = this.getSortedList(initList);
        this.root = fillTree(list);
    }

    public TreeNode fillTree(List<Integer> list) {
        if (!list.isEmpty()) {
            int indexOfCenter = list.size() / 2;
            TreeNode newNode = new TreeNode(list.get(indexOfCenter));
            List<Integer> leftList = list.subList(0, (list.size() / 2));
            List<Integer> rightList = list.subList((list.size() / 2) + 1, list.size());
            newNode.setLeftChild(fillTree(leftList));
            newNode.setRightChild(fillTree(rightList));
            return newNode;
        }
       return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void doInsert(Integer item) {
        TreeNode currentNode = root;
        TreeNode newNode = new TreeNode(item);
        insert(newNode, currentNode);
    }

    private void insert(TreeNode newNode, TreeNode currentRoot) {
        if (root == null) {
            root = newNode;
            return;
        }

        if (newNode.getValue() < currentRoot.getValue()) {
            if (currentRoot.getLeftChild() == null) {
                currentRoot.setLeftChild(newNode);
                newNode.setParent(currentRoot);
            } else {
                currentRoot = currentRoot.getLeftChild();
                insert(newNode,currentRoot);
            }
        } else {
            if (currentRoot.getRightChild() == null) {
                currentRoot.setRightChild(newNode);
                newNode.setParent(currentRoot);
            } else {
                currentRoot = currentRoot.getRightChild();
                insert(newNode,currentRoot);
            }
        }
    }

    public Integer doFind(Integer element) {
        TreeNode currentNode = root;
        return this.find(element, currentNode);
    }

    @Override
    public Integer find(Integer element, TreeNode currentNode) {
        Integer result;
        if (Objects.equals(currentNode.getValue(), element)) {
            result = currentNode.getValue();
        } else {
            result =  null;
        }

        if (element < currentNode.getValue() && currentNode.getLeftChild() != null) {
            currentNode = currentNode.getLeftChild();
            return find(element, currentNode);
        }
        if (element > currentNode.getValue() && currentNode.getRightChild() != null) {
            currentNode = currentNode.getRightChild();
            return find(element, currentNode);
        }
        return result;
    }

    @Override
    public List getSortedList(List<Integer> list) {
        boolean needSort;
        int temp;
        do {
            needSort = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i,list.get(i + 1));
                    list.set(i + 1, temp);
                    needSort = true;
                }
            }
        } while (needSort);
        return list;
    }

    public BinarySearchTree balance() {
        List<Integer> rebalanceList = new ArrayList<>();
        toStack(root);
        while (!tempStack.isEmpty()) {
            rebalanceList.add(tempStack.poll().getValue());
        }
        return new BinarySearchTree(rebalanceList);
    }

    private void toStack(TreeNode root) {
        if (root != null) {
            tempStack.addFirst(root);
            toStack(root.getLeftChild());
            toStack(root.getRightChild());
        }
    }
}
