package com.datastruct.set;

public class TestSet {

    public static void main(String[] args) {
        BSTSet<Integer> bstSet = new BSTSet<>();
        bstSet.add(10);
        bstSet.add(20);
        bstSet.add(10);
        System.out.println("bstSet.getSize()="+bstSet.getSize());
        LinkedListSet<Integer> linkedListSet = new LinkedListSet<>();
        linkedListSet.add(10);
        linkedListSet.add(20);
        linkedListSet.add(10);
        System.out.println("linkedListSet.getSize()="+linkedListSet.getSize());
    }
}
