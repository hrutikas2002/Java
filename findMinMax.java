// Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class findMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the "+i+"th element: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array is");
        for(int i=0; i<size; i++){
            System.out.print(numbers[i]+" ");
        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i =0; i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }

            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("\nThe maximum value from the array is: "+max);
        System.out.println("The minimum value from the array is: "+min);
    }
}
