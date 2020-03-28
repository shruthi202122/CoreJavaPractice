package com.pract.general;

import java.lang.*;
public class Student implements Comparable{
    int rollNo;
    String sname;
   public Student(int rollNo,String sname){
       this.rollNo=rollNo;
       this.sname=sname;
   }
   public String toString(){
       return" "+rollNo;
   }
   public int compareTo(Object obj){
       int s1=this.rollNo;
       Student s=(Student)obj;
       int s2=s.rollNo;
       if(s1<s2){
           return -1;
       }
       else if(s1>s2){
           return 1;
       }
       else {
            return 0; 
       }
   }
   

}