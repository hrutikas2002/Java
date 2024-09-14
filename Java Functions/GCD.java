// c:\Users\rutik\Pictures\Screenshots\Screenshot (354).png 
/*In each iteration, the larger number (a) is replaced by the smaller number (b), and the smaller number (b) is replaced by the remainder of a % b.
This process continues until the remainder (b) becomes zero. At this point, a will hold the greatest common divisor. */
// Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.*;

public class GCD {
    public static int getGCD(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int GCD =  getGCD(a, b);

        System.out.println("GCD of two numbers is: "+GCD);
       
    }
    
}