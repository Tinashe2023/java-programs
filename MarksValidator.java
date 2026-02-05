import java.util.Scanner;

public class MarksValidator {
    public static void main(String[] args) {
        int e;  
        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.print("Enter marks of Java(0 to 100):");
            e = sc1.nextInt();
            if(e < 0 || e > 100) {
                System.out.println("Invalid marks");
            }
        } while(e < 0 || e > 100);
        System.out.println("Marks entered: " + e);
        sc1.close();  
    }
}