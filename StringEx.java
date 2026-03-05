import java.util.*;

class StringEx{
    public static void main(String[] args)
    {
        String s1 =new String("Tinashe");
        String s2 =new String("Tinaye");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println("Tinashe".compareTo("Tinaye"));
    }
}