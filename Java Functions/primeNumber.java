// Make a function to check if a number is prime or not.

import java.util.*;

public class primeNumber {
    
    // Function Decalared
    public static String primeNumber(int num){

        boolean isPrime = true;

        if (num<=1){
            isPrime = false;
        }
        for (int i = 2; i<=num/2; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }

        if (isPrime){
           return "Number is prime";
        }
        else{
            return "Number is not prime";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        System.out.print(primeNumber(num));     // Calling to function
    }
}
