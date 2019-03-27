package com.datastruct.map;

public class TestMap {

    public static void main(String[] args) {
        LinkedListMap<String, Integer> map = new LinkedListMap<>();
        map.add("数学", 70);
        map.add("语文", 80);
        map.add("英语", 90);
        System.out.println(map.get("英语"));
        System.out.println("map.getSize()="+map.getSize());

        BSTMap<String, Integer> bstMap = new BSTMap<>();
        bstMap.add("数学", 70);
        bstMap.add("语文", 80);
        bstMap.add("英语", 90);
        System.out.println(bstMap.get("英语"));
        System.out.println("bstMap.getSize()="+bstMap.getSize());
    }
}
