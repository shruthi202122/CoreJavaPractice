package com.pract.general;


public class RevOrder{
    public void display(int number){
        System.out.println(number);
        if(number == 0) {
            return;
        }
        display(number - 1);
        System.out.println (number+1);
    }
}