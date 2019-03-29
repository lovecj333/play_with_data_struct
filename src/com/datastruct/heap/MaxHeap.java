package com.datastruct.heap;

import com.datastruct.array.Array;

public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capacity){
        data = new Array<>(capacity);
    }

    public MaxHeap(){
        data = new Array<>();
    }

    public MaxHeap(E[] arr){
        data = new Array<>(arr);
        for(int i = parent(arr.length - 1);i >= 0;i--){
            siftDown(i);
        }
    }

    // 返回堆中的元素个数
    public int size(){
        return data.getSize();
    }

    // 返回一个布尔值, 表示堆中是否为空
    public boolean isEmpty(){
        return data.isEmpty();
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的父亲节点的索引
    private int parent(int index){
        if(index == 0){
            throw new RuntimeException("index-0 is root node");
        }
        return (index - 1) / 2;
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
    private int leftChild(int index){
        return index * 2 + 1;
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
    private int rightChild(int index){
        return index * 2 + 2;
    }

    // 向堆中添加元素
    public void add(E e){
        data.addLast(e);
        //将新添加的元素往上走、以保证父节点比子节点的值大
        siftUp(data.getSize() - 1);
    }

    // 将堆中的某一位置的值往上走、以保证父节点比子节点的值大
    private void siftUp(int index){
        if(index <= 0){
            return;
        }
        int parentIndex = parent(index);
        if(data.get(index).compareTo(data.get(parentIndex)) <= 0){
            return;
        }
        if(data.get(index).compareTo(data.get(parentIndex)) > 0){
            data.swap(index, parentIndex);
        }
        siftUp(parentIndex);
    }

    // 将堆中的某一位置的值往下走、以保证父节点比子节点的值大
    private void siftDown(int index){
        int leftChildIndex = leftChild(index);
        if(leftChildIndex >= data.getSize()){
            return;
        }
        int maxIndex = leftChildIndex;
        int rightChildIndex = rightChild(index);
        if(rightChildIndex < data.getSize() &&
                data.get(maxIndex).compareTo(data.get(rightChildIndex)) < 0){
            maxIndex = rightChildIndex;
        }
        if(data.get(index).compareTo(data.get(maxIndex)) > 0){
            return;
        }
        data.swap(index, maxIndex);
        siftDown(maxIndex);
    }

    // 看堆中的最大元素
    public E findMax(){
        if(data.getSize() == 0){
            throw new RuntimeException("Can not findMax when heap is empty");
        }
        return data.get(0);
    }

    // 取出堆中最大元素
    public E extractMax(){
        E ret = findMax();
        data.swap(0, data.getSize()-1);//第一个元素和最后一个元素交换位置
        data.removeLast();//删除最后一个元素
        //将新的第一个元素往下走、以保证父节点比子节点的值大
        siftDown(0);
        return ret;
    }

    // 取出堆中的最大元素，并且替换成元素e
    public E replace(E e){
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }
}
