// Take an array as input from user. Search for a given number x and print the index at which it occurs.
import java.util.*;
public class findNumberFromArray{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int size = scan.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the "+i+"th item: ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("Array is: ");
        for(int i=0; i<size; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.print("\nEnter the value which you want to find: ");
        int x = scan.nextInt();

        for(int i=0; i<size;i++){
            if(numbers[i]==x){
                System.out.println("Element is found at position "+i);
            }
        }
        
        
    }

}