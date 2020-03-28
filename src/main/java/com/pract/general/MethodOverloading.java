package com.pract.general;

public class MethodOverloading{
    public void add(int a,int b){
        int c=a+b;
        System.out.println("a+b = " +c);
    }
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("a+b+c = "+d);
    }
    public static void main(String[] arg){
        MethodOverloading m=new MethodOverloading();
        m.add(2,5);
    }
    
}