import java.util.Scanner;

public class ArrayAdd{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];
        
        System.out.println("\n=== Input for Array A ===");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n=== Input for Array B ===");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element b[" + i + "][" + j + "]: ");
                b[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n=== Adding Arrays ===");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        System.out.println("\nArray A:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nArray B:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nArray C (A + B):");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Detailed Addition ===");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("c[" + i + "][" + j + "] = a[" + i + "][" + j + "] + b[" + i + "][" + j + "] = " + a[i][j] + " + " + b[i][j] + " = " + c[i][j]);
            }
        }
        
        scanner.close();
    }
}