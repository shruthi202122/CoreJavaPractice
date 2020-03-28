package com.pract.general;

public class StaticVar{
    int a=10;
    static int b=20;
    public static void main(String[] arg){
        StaticVar s1=new StaticVar();
        System.out.println("s1.a = "+s1.a);
        System.out.println("s1.b = "+s1.b);

        StaticVar s2=new StaticVar();
        System.out.println("s2.b = "+s2.b);
        s1.b=200;
        System.out.println("s1.b = "+s1.b);
        System.out.println("s2.b = "+s2.b);

        StaticVar s3=new StaticVar();
        System.out.println("s3.b = "+s3.b);
    }
}