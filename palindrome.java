// Java program checks whether a given string is a palindrome by reversing the string and comparing it to the original, then prints the result.

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = scan.nextLine();

        String reversedString = "";

        for (int i = string.length()-1; i>=0; i--){
            reversedString +=string.charAt(i);

        }

        if (string.equals(reversedString)){
            System.out.println(string+" is a palindrome string.");
        }
        else{
            System.out.println(string+" is not palindrome string.");
        }
    }
}
