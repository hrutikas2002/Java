// program to compare two numbers 

import java.util.*;
public class greaterSmallerEqual {
    public static void main(String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int A = scan.nextInt();

        System.out.print("Enter the Second number: ");
        int B = scan.nextInt();

        if (A == B){
            System.out.println("Both Numbers are equal");
        }

        else{
            if (A>B){
                System.out.println("First number is greater than second");
            }
            else{
                System.out.println("Second Number is greater than first");
            }
        }
    }
    
}
