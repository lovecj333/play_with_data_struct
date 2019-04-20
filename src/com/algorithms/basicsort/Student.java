package com.algorithms.basicsort;

public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    // 定义Student的compareTo函数
    // 如果分数相等，则按照名字的字母序排序
    // 如果分数不等，则分数低的靠前
    @Override
    public int compareTo(Student o) {
        if(this.score < o.score){
            return -1;
        }else if(this.score > o.score){
            return 1;
        }else{//this.score == o.score
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
