package com.datastruct.heap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Leecode347 {

    private class Freq implements Comparable<Freq>{

        public int e;
        public int freq;

        public Freq(int e, int freq){
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq o) {
            if(this.freq < o.freq){
                return -1;
            }else if(this.freq > o.freq){
                return 1;
            }else{
                return 0;
            }
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();//key元素 value元素个数
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        java.util.PriorityQueue<Freq> pq = new java.util.PriorityQueue<>();
        for(int key : map.keySet()){
            if(pq.size() < k){
                pq.add(new Freq(key, map.get(key)));
            }else{
                if(map.get(key) > pq.peek().freq){
                    pq.poll();
                    pq.add(new Freq(key, map.get(key)));
                }
            }
        }

        LinkedList<Integer> res = new LinkedList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll().e);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(new Leecode347().topKFrequent(nums, k));
    }
}
