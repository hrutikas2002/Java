// Java program checks whether a given number is positive, negative, or zero and prints the corresponding message.

import java.util.*;
public class positiveNegativeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num<0){
            System.out.println("Number is negative.");
        } else if(num>0) {
            System.out.println("Number is Positive.");
        } else {
            System.out.println("Number is zero.");
        }
    }
}
