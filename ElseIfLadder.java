import java.util.Scanner;
public class ElseIfLadder{
    public static void main(String[] arg){
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks : ");
        marks=sc.nextInt();
        if(marks>100 || marks<0)
        System.out.println("marks are out of range -Please Enter Proper marks-");
        else if(marks>=80)
        System.out.println("A grade");
        else if(marks>=65)
        System.out.println("B grade");
        else if(marks>=50)
        System.out.println("C grade");
        else if(marks>=35)
        System.out.println("D grade");
        else
        System.out.println("fail");
    }
}