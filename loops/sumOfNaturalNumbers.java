// This Java program calculates and prints the sum of natural numbers from 1 to a given number using a for loop.
import java.util.*;
public class sumOfNaturalNumbers{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
         int sum =0;
        for (int i = 1; i<=n; i++){
            sum = sum+i;
        }

        System.out.println("Addition of numbers from 1 to "+n+" is: "+sum);
    }
}