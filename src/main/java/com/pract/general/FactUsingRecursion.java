package com.pract.general;

import java.util.Scanner;
public class FactUsingRecursion{
    public static void main(String[] arg){
        Factorial f=new Factorial();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("factorial of a given number : "+f.fact(n));

    }
}