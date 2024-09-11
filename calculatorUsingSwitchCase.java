// Program to demonstrate calculator using switch cases
/*
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/


import java.util.Scanner;

public class calculatorUsingSwitchCase {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();

        System.out.print("Enter the Second value: ");
        int b = scan.nextInt();

        System.out.println("Enter the choice of operation which you want to perform: \n 1. Addition \n 2. Subtraction \n 3. multiplication \n 4. Division \n 5. Remainder");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: System.out.println("Addition of "+a+ " and "+b+" is: "+(a+b));
                break;

            case 2: System.out.println("Subtraction of "+a+ " and "+b+" is: "+(a-b));
            break;

            case 3: System.out.println("Multiplication of "+a+ " and "+b+" is: "+(a*b));
            break;

            case 4: System.out.println("Division of "+a+ " and "+b+" is: "+(a/b));
            break;

            case 5: System.out.println("Modulo of "+a+ " and "+b+" is: "+(a%b));
            break;
        
            default: System.out.println("Please enter the valid choice!");
                break;
        }

        System.out.println("Thank You For using Calculator! Have a Great Day....");
    } 
}
