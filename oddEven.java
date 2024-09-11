//  Java program takes an integer input from the user and checks whether the number is even or odd, then prints the corresponding message.

import java.util.Scanner;
public class oddEven {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int N = scan.nextInt();

        if (N%2==0){
            System.out.println("Number is Even!!");
        }

        else{
            System.out.println("Number is odd!!");
        }

    }

}
