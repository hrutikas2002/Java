import java.util.*;

public class sumUsingMethod{

    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int calculateDifference(int a, int b)
    {
        int differ = a-b;
        return differ;
    }

    public static void main(String args []) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();

        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("\nSum of "+a+" and "+b+ " is "+sum);

        int differ = calculateDifference(a, b);
        System.out.println("\nSubtraction of "+a+" and "+b+ " is "+differ); 
    }
}