package com.pract.general;

import java.util.*;

public class StudentTreeSet{
    public static void main(String[] arg){
        TreeSet<Student> ts=new TreeSet<Student>();
        ts.add(new Student(1,"shruthi"));
        ts.add(new Student(2,"abc"));
        ts.add(new Student(44,"cdf"));
        ts.add(new Student(30,"sdgh"));
        System.out.println("student : "+ts);
    }
}