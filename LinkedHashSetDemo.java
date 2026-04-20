import java.util.*;
public class LinkedHashSetDemo
{
    public static void main(String []args)
    {
        Set<String> names = new LinkedHashSet<String>();
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