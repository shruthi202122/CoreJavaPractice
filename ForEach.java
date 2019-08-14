import java.util.*;
public class ForEach{
    public static void main(String[] arg){
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        for(int s:set){
            System.out.println(s);
        }
    }
}