interface MyInterface
{
    String killMyMethod(String str);
}
public class LambdaEx3
{
    public static void main(String[] args)
    {
        MyInterface exclaim = (s)-> s + "!";
        MyInterface ask = (s) -> s +"?";
        String result1 = exclaim.killMyMethod("Hello");
        System.out.println(result1);
        String result2 = ask.killMyMethod("Hello");
        System.out.println(result2);
    }
}