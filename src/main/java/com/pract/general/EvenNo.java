package com.pract.general;

public class EvenNo{
    public static void main(String[] arg){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
} 