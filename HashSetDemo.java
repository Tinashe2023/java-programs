import java.util.*;
public class HashSetDemo
{
    public static void main(String []args)
    {
        Set names = new HashSet();
        names.add("Tinashe");
        names.add("Park");
        names.add("Yoon");
        names.add("YOON");
        System.out.println("names="+ names);
        names.add("YoOn");
        names.add("Eunie");
        System.out.println("names="+ names);
        names.remove("YoOn");
        System.out.println("names="+ names);

    }
}