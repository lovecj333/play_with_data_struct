package com.algorithms.basicsort;

import java.util.Arrays;

public class SelectionSort1 {

    private SelectionSort1(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for(int j = i + 1;j < n;j++){
                // 使用compareTo方法比较两个Comparable对象的大小
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                swap(arr, i, minIndex);
            }
        }
    }

    private static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        // 测试Integer
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
        // 测试Double
        Double[] b = {4.4, 3.3, 2.2, 1.1};
        sort(b);
        System.out.println(Arrays.toString(b));
        // 测试String
        String[] c = {"D", "C", "B", "A"};
        sort(c);
        System.out.println(Arrays.toString(c));
        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D",90);
        d[1] = new Student("C",100);
        d[2] = new Student("B",95);
        d[3] = new Student("A",95);
        sort(d);
        System.out.println(Arrays.toString(d));
    }
}
