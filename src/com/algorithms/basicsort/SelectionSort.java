package com.algorithms.basicsort;

import java.util.Arrays;

public class SelectionSort {

    private SelectionSort(){}

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for(int j = i + 1;j < n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                swap(arr, i, minIndex);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
