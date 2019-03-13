package com.datastruct.queue;

public class TestLinkedListQueue {

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue();
        for(int i=0;i<10;i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.getFront());
    }
}
