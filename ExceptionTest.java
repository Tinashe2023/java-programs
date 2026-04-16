import java.util.*;

class MyException extends Throwable
{
    public MyException(int i)
    {
        System.out.println("You have entered" +i);
        System.out.println("It exceeding the limit");

    }
}
public class ExceptionTest
{
    public void show(int i) throws MyException
    {
        if(i>100)
        
            throw new MyException(i);
        
            else
        
            System.out.println(i+"is less than 100 it is Ok");
    }
        public static void main(String[] args)
        {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            ExceptionTest t = new ExceptionTest();
            try{
                t.show(i);
                t.show(j);
            }
            catch(Throwable e)
            {
                System.out.println("catched exeption is"+e);
            }
        }
    }
