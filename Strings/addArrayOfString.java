// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
public class addArrayOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr size of array: ");
        int size = sc.nextInt();
        
        String [] strarray = new String [size];

        System.out.println("Enter the elements in array(press enter after each entry)");
        for(int i =0; i<size;i++){
            strarray[i]=sc.next();
        }

        System.out.println("Array is: ");
        for(int i =0;i<size;i++){
            System.out.print(strarray[i]+" ");
        }

        int totalLength = 0;
        for(int i =0; i<size; i++){
            totalLength = totalLength+ strarray[i].length();
        }
        System.out.println("\nTotal length = "+totalLength);
    }    
}
