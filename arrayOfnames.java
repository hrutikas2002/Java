// Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class arrayOfnames {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter size the of array: ");
        int size = scan.nextInt();

        scan.nextLine();        // after nextInt(): This consumes the newline left after reading the integer size, allowing you to properly input names with nextLine().

        String names[] = new String[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+"th element: ");
            names[i] = scan.nextLine();
        }

        System.out.println("Array is: ");
        for(int i = 0; i<size; i++){
            System.out.println(names[i]);
        }

    }
}
