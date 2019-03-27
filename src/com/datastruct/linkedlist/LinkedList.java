package com.datastruct.linkedlist;

public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    public final String msgException = "就想问问你,你的index怎么传的,想咋的,是不是不服";
    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node();
        size = 0;
    }

    // 获取链表中的元素个数
    public int getSize(){
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 在链表的index位置添加新的元素e
    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new RuntimeException(msgException);
        }
        //找到要添加的index位置的前一个节点
        Node pre = dummyHead;
        for(int i=0;i<index;i++){
            pre = pre.next;
        }
        Node node = new Node(e);
        node.next = pre.next;//新建的节点的next指向前一个节点的next
        pre.next = node;//前一个节点的next指向新建的节点
        size++;
    }

    // 在链表头添加新的元素e
    public void addFirst(E e){
        add(0, e);
    }

    // 在链表末尾添加新的元素e
    public void addLast(E e){
        add(size, e);
    }

    // 从链表中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new RuntimeException(msgException);
        }
        //找到要添加的index位置的前一个节点
        Node pre = dummyHead;
        for(int i=0;i<index;i++){
            pre = pre.next;
        }
        Node delNode = pre.next;//得到要删除的节点
        pre.next = delNode.next;//将要删除的节点的下一个节点赋值给前一个节点的next
        delNode.next = null;//要删除节点的next赋值为null
        size--;
        return delNode.e;
    }

    // 从链表中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从链表中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从链表中删除元素e
    public void removeElement(E e){
        Node pre = dummyHead;
        while(pre.next != null){
            if(pre.next.equals(e)){
                break;
            }
            pre = pre.next;
        }
        if(pre.next != null){
            Node delNode = pre.next;//得到要删除的节点
            pre.next = delNode.next;//将要删除的节点的下一个节点赋值给前一个节点的next
            delNode.next = null;//要删除节点的next赋值为null
            size--;
        }
    }

    // 获得链表的第index个位置的元素
    public E get(int index){
        if(index < 0 || index >= size){
            throw new RuntimeException(msgException);
        }
        Node cur = dummyHead.next;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        return cur.e;
    }

    // 获得链表的第一个元素
    public E getFirst(){
        return get(0);
    }

    // 获得链表的最后一个元素
    public E getLast(){
        return get(size - 1);
    }

    // 修改链表的第index个位置的元素为e
    public void set(int index, E e){
        if(index < 0 || index >= size){
            throw new RuntimeException(msgException);
        }
        Node cur = dummyHead.next;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        cur.e = e;
    }

    // 查找链表中是否有元素e
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur.e).append("->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
