//Java program checks whether a given number is prime by dividing it by numbers up to half of its value, then prints whether it is prime or not.

import java.util.Scanner;
public class primeNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        boolean isprime = true;

        if(num<=1){
            isprime = false;
        } else{
            for (int i = 2; i<=num/2; i++){
                if (num%i == 0){
                    isprime = false;
                    break;
                }
            }
        }

        if (isprime){
            System.out.println(num+" is prime number!!");
        }
        else{
            System.out.println(num+" is not prime number!!");
        }

    }
    
}
