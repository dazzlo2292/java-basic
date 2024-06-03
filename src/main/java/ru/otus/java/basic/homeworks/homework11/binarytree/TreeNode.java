package ru.otus.java.basic.homeworks.homework11.binarytree;

public class TreeNode {
    private TreeNode parent;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private Integer value;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getValue() {
        return value;
    }
}
