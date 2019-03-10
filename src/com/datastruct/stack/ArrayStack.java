package com.datastruct.stack;

import com.datastruct.array.Array;

public class ArrayStack<E> implements Stack<E>{

    private Array<E> arr;

    public ArrayStack(int capacity){
        arr = new Array<>(capacity);
    }

    public ArrayStack(){
        arr = new Array<>();
    }

    @Override
    public int getSize() {
        return arr.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public int getCapacity(){
        return arr.getCapacity();
    }

    @Override
    public void push(E e) {
        arr.addLast(e);
    }

    @Override
    public E pop() {
        return arr.removeLast();
    }

    @Override
    public E peek() {
        return arr.getLast();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < arr.getSize() ; i ++){
            res.append(arr.get(i));
            if(i != arr.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
