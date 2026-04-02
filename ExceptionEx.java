import java.util.*;

class ExceptionEx
{
    public static void main(String args[])
    {
        System.out.println("Enter two numbers");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        try
        {
            int z = x/y;
            System.out.println("Result of division is:" + z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Variable y must be non-zero");
        }
    }
}