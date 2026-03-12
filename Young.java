import java.util.Scanner;

class Projector{
    String Brand;
    int Price;
    int Warranty;
   void input()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Brand: ");
    Brand=sc.nextLine();
    System.out.println("Enter Price: ");
    Price=sc.nextInt();
    System.out.println("Enter Warranty: ");
    Warranty=sc.nextInt();
   }
    void displayInfo()
    {
        System.out.println("Brand: "+Brand);
        System.out.println("Price:₹"+Price);
        System.out.println("Warranty: "+Warranty);
    }
}
public class Young{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Projector p1=new Projector();
        p1.input();
        p1.displayInfo();
    }
}