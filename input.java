// program to demonstrate input through Scanner class in java

import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
    }
}