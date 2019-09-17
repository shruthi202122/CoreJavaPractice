public class Child extends Parent{
    public static void m1(){
        System.out.println("m1() child");
    }
    public void m2(){
        System.out.println("m2() child");
    }
    public static void main(String[] arg){
        Parent p=new Parent();
        //p.m1();
        
        Child c=new Child();
        //c.m1();
        //c.m2();
        Parent p1=new Child();
        //Parent.m1();
        p1.m2();
    


    }
}