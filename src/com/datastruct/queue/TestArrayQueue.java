package com.datastruct.queue;

public class TestArrayQueue {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue();
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
    }
}
