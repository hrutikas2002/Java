// Make a function to check if a given number n is even or not.

import java.util.*;
public class evenOdd {
    public static String checkEvenOdd(int num)  // Function declared
    {
        if(num%2==0){
            return "Even Number!";      // function return string
        }
        else{
            return "Odd Number!";       //function return string
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num  = scan.nextInt();

        System.out.println(checkEvenOdd(num));  //Function called
    }
}
