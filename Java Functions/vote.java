// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class vote {
    public static void checkEligibility(int age){
        if (age>18){
            System.out.println("You are eligible to vote.");
        }
        else if(age<0){
            System.out.println("please enter valid age");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter your name: ");
        String name  = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Hello "+name+"!!");
        checkEligibility(age);
    }
}
