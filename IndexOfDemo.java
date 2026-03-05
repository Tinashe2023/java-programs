import java.util.*;

class IndexOfDemo{
    public static void main(String args[]){
        String s="Now is the time for all good men"+ "to come to the 
        aid of their country";

        System.out.println(s);
        System.out.println("IndexOf(t)="+s.indexOf('t'));
        System.out.println("LastIndexOf(t)="+s.lastIndexOf('t'));
        System.out.println("IndexOf(th)="+s.indexOf("th"));
        System.out.println("LastIndexOf(th)="+s.lastIndexOf("th"));
    }
}
