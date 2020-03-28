package com.pract.general;

import java.util.*;
public class TreeSetDemo{
    public static void main(String[] ar){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(1);
        ts.add(3);
        ts.add(null);
        ts.add(6);
        ts.add(2);
        ts.add(4);
        ts.add(5);
        System.out.println("TreeSet : "+ts);
    }
}
