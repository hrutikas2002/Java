// Enter 3 numbers from the user & make a function to print their average

import java.util.*;
public class averageOfNumbers {
        public static float average(int n1, int n2, int n3){
            float avg = (n1 + n2 + n3)/3;
            return avg;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int n2 = sc.nextInt();

            System.out.print("Enter the third number: ");
            int n3 = sc.nextInt();

            System.out.println("The average of numbers is: "+average(n1, n2, n3));
        }
}
