package com.datastruct.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Leecode350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num, map.get(num)-1);
                if(map.get(num) == 0){
                    map.remove(num);
                }
            }
        }

        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] arr = new Leecode350().intersect(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
}
