// Java program takes an integer input and prints the multiplication table of that number up to 10 using a for loop.
import java.util.*;
public class tableOfnumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number: ");
         int n = sc.nextInt();

         System.out.println("Table of "+n+" is: ");
         
         for (int i=1; i<=10; i++ ){
            System.out.println(i*n);
         }
    }
}
