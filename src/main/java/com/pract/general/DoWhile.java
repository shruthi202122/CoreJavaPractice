package com.pract.general;

import java.util.Scanner;
public class DoWhile{
    public static void main(String[] arg){
        int sum=0;
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        number=sc.nextInt();

        do{
            sum=sum+number;
            number--;
        }
        while(number>0);
        System.out.println("sum of number ="+sum);
    }
}