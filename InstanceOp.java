public class InstanceOp{
    public static void main(String[] arg){
        Animal a=new Animal();
        Dog d=new Dog();
        InstanceOp i=new InstanceOp();
        Object o=new Object();
        System.out.println(a instanceof Object);
        System.out.println(d instanceof Animal);
        System.out.println(i instanceof Object);
        System.out.println(o instanceof Animal);

        //String s=new String();
        StringBuffer sb=new StringBuffer();
        System.out.println(sb instanceof String); 
        // we use instanceOf operator when we typecast..
    }
}
