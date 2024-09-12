// Java program calculates the factorial of a given number using different loop structures (for, while, and do-while loops), and prints the result.

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        // Using For Loop:
        /*
        int factorial=1;
        for (int i= 1; i<=num; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
         */

         // Using while loop
        /*
         int i = 1, factorial =1;
        while(i<=num){
            factorial = factorial*i;
            i++;
        }
        System.out.print("Factorial of number "+num+" is: "+factorial);
         */

         //Using Do While Loop

         int i = 1, factorial =1;
         do{
            factorial*=i;
            i++;
         } while(i<=num);

         System.out.println("Factorial of "+num+" is: "+factorial);
    }
}
