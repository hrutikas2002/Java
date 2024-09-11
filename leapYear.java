//  Java program checks if a given year is a leap year and prints an appropriate message.

import java.util.*;
public class leapYear {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if ((year%2==0 && year%100!=0) || (year%400==0))
        {
            System.out.println("Year is leap year!");
        }
        else{
            System.out.println("Year is not leap year!");
        }

        System.out.println("Have a great year ahead!!");
    }

    
    
}
