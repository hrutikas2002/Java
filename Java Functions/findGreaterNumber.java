// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class findGreaterNumber {
    public static String findGreaterNumber(int n1,int n2){
        if(n1>n2){
            return "First number is greater than second number";
        } else if(n1<n2){
            return "Second number is greater than first number";
        } else{
            return "Numbers are equal";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scan.nextInt();

        String result = findGreaterNumber(n1, n2);
        System.out.println(result);
    }
}
