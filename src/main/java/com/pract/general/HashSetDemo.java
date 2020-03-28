package com.pract.general;

import java.util.HashSet;

public class HashSetDemo{
    public static void main(String[] arg){
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(22);
        hs.add(3);
        hs.add(55);
        hs.add(34);
        hs.add(47);
        hs.add(58);
        hs.add(34);//duplicates not allowed & insertion order not preserved
        hs.add(null);//null insertion possible
        System.out.println("HashSet : "+hs);
    }
}