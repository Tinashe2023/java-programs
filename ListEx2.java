import java.util.*;

class ListEx2{

    public static void main(String[] args){
        List<Integer>intList1=new ArrayList<Integer>();

        intList1.add(0,10);
        intList1.add(1,20);
        intList1.add(2,30);

        System.out.println(intList1);

        intList1.remove(1);
        System.out.println(intList1);

    }
}