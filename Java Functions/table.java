//Make a function to print the table of a given number n.

import java.util.*;
public class table {
    public static void calculateTable(int num)
    {
        for (int i=1; i<=10; i++){
            System.out.println(i*num); 
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        calculateTable(num);
        }
    }

