import java.util.Scanner;

class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.ensureCapacity(22);
        System.out.println(sb.capacity());
        sb.ensureCapacity(23);
        System.out.println(sb.capacity());
        
    }
}
