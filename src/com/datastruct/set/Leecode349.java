package com.datastruct.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Leecode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums1){
            hashSet.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(hashSet.contains(num)){
                list.add(num);
                hashSet.remove(num);
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
        int[] arr = new Leecode349().intersection(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
}
