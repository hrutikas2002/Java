// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class powerCalculation {
    public static int getPower(int x, int n){

        int result = 1;
        for(int i = 1; i<=n; i++){
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();

        int power = getPower(x, n);
        System.out.println(x+" raised to the power "+n +" is "+power);
    }
}
