package com.datastruct.tree;

public class BST<E extends Comparable<E>> {

    private class Node{
        public E e;
        public Node left;
        public Node right;

        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // 向二分搜索树中添加新的元素e
    public void add(E e){
        if(root == null){
            root = new Node(e);
            size++;
        }else{
            add(root, e);
        }
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法
    private void add(Node node, E e){
        if(e.compareTo(node.e) == 0){
            //相等、不可以有重复的元素
            return;
        }else if(e.compareTo(node.e) < 0 && node.left == null){
            //小于当前节点、并且当前节点的左子树为空
            node.left = new Node(e);
            size++;
            return;
        }else if(e.compareTo(node.e) > 0 && node.right == null){
            //大于当前节点、并且当前节点的右子树为空
            node.right = new Node(e);
            size++;
            return;
        }

        if(e.compareTo(node.e) < 0){
            add(node.left, e);
        }else{//e.compareTo(node.e) > 0
            add(node.right, e);
        }
    }

    // 看二分搜索树中是否包含元素e
    public boolean contains(E e){
        return contains(root, e);
    }

    // 看以node为根的二分搜索树中是否包含元素e, 递归算法
    public boolean contains(Node node, E e){
        if(node == null){
            return false;
        }
        if(e.compareTo(node.e) == 0){
            return true;
        }else if(e.compareTo(node.e) < 0){
            return contains(node.left, e);
        }else{//e.compareTo(node.e) > 0
            return contains(node.right, e);
        }
    }
}
