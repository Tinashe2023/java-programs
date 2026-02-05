import java.util.Scanner;

public class ArrayIntro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Array A ");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array1 = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++){
            System.out.print("Element " + (i+1) + ": ");
            array1[i] = scanner.nextInt();
        }
        
       
        System.out.println("\nPrinting array elements one by one:");
        for(int i = 0; i < array1.length; i++){
            System.out.println("Element at index " + i + ": " + array1[i]);
        }
        
        
        System.out.println("\n Adding Two Arrays");
        
        
        int[] array2 = new int[size];
        System.out.println("Enter " + size + " elements for the second array:");
        for(int i = 0; i < size; i++){
            System.out.print("Element " + (i+1) + ": ");
            array2[i] = scanner.nextInt();
        }
        
        
        int[] sumArray = new int[size];
        for(int i = 0; i < size; i++){
            sumArray[i] = array1[i] + array2[i];
        }
        
        
        System.out.println("\nArray Addition Result:");
        for(int i = 0; i < size; i++){
            System.out.println(array1[i] + " + " + array2[i] + " = " + sumArray[i]);
        }
   
        System.out.println("\n Print Whole Arrays at Once ");
        
        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));
        System.out.println("Sum Array: " + java.util.Arrays.toString(sumArray));
        
        System.out.print("\nArray 1 (manual): [");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            if(i < array1.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}