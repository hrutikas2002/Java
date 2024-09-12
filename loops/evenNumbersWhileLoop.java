// Java program uses a while loop to take an integer input and print all even numbers from 1 to the input value.
import java.util.*;
public class evenNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number until you want even numbers: ");
        int n = sc.nextInt();

        System.out.println("Even numbers from 1 to "+n+" are: ");
    int i = 1;
         while (i<=n){
            if (i%2==0){
                System.out.println(i);
               
            }
            i++;
         }
}
}