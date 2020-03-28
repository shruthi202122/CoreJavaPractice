package com.pract.general;

public class InstanceVar{
    int a=10;
    int b=20;
    public static void main(String[] args){
        InstanceVar v1=new InstanceVar();
        System.out.println("v1.a = "+v1.a);
        System.out.println("v1.b = "+v1.b);

        InstanceVar v2=new InstanceVar();
        System.out.println("v2.a = "+v2.a);
        System.out.println("v2.b = "+v2.b);
        v1.a=100;
        v1.b=200;
        System.out.println("v1.a = "+v1.a);
        System.out.println("v1.b = "+v1.b);
        System.out.println("v2.a = "+v2.a);
        System.out.println("v2.b = "+v2.b);
    }
}