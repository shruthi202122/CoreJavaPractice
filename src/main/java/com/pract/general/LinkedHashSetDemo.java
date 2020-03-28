package com.pract.general;

import java.util.*;

public class LinkedHashSetDemo{
    public static void main(String[] arg){
        LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
        hs.add(22);
        hs.add(3);
        hs.add(55);
        hs.add(34);
        hs.add(47);
        hs.add(58);
        hs.add(34);//duplicates not allowed & order preserved
        hs.add(null);//null insertion possible
        System.out.println("LinkedHashSet : "+hs);
    }
}