import java.util.*;

public class HashMapEx
{
    public static void main(String[] args)
    {
        Map myMap = new HashMap<String, String>();
        myMap.put("Asm","Assam");
        myMap.put("WB","West Bengal");
        myMap.put("Mah","Maharashtra");
        myMap.put("Guj","Gujarat");
        myMap.put("PB", "Punjab");
        System.out.println("HashMap:" + myMap);
        myMap.put("WB","West Bengal");
        System.out.println("After inserting duplicate key WB:" + myMap);
        myMap.remove("Mah");
        System.out.println("After removing key Mah:" + myMap);
        System.out.println("myMap.get(\"PB\"):" +myMap.get("PB"));
    }
}