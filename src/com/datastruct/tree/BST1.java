package com.datastruct.tree;

public class BST1<E extends Comparable<E>> {

    private class Node1{
        public E e;
        public Node1 left;
        public Node1 right;

        public Node1(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node1 root;
    private int size;

    public BST1(){
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
        root = add(root, e);
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法
    // 返回插入新节点后二分搜索树的根
    private Node1 add(Node1 node, E e){
        if(node == null){
            size ++;
            return new Node1(e);
        }

        if(e.compareTo(node.e) < 0){
            node.left = add(node.left, e);
        }else if(e.compareTo(node.e) > 0){
            node.right = add(node.right, e);
        }

        return node;
    }
}
