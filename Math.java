public class Math {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Sum=" + add(a, b));
        System.out.println("Difference=" + sub(a, b));
        System.out.println("Product=" + mul(a, b));
        System.out.println("Quotient=" + div(a, b));
        System.out.println("Remainder=" + mod(a, b));
       
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }
}