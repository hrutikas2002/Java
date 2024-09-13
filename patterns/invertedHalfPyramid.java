// program prints an inverted half-pyramid using stars (*).
import java.util.*;
public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of n: ");
        int n = scan.nextInt();

        for (int i = n; i>=1; i--){         // Number of rows
            for (int j =1; j<=i; j++){      // Reduces space by one star at each iteration
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
