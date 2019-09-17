public class Methods{
    public void add(){
        sub();
        System.out.println("instance add()");
    }
    public void mul(){
        System.out.println("mul()");
    }
    public static  void sub(){
        System.out.println("static Sub()");
        Methods m=new Methods();
        m.mul();
    }
    public static void main(String[] arg){
        Methods m=new Methods();
        m.add();
        Methods.sub();
    }
}