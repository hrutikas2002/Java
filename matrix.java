// Take a matrix as input from the user. search for a given number x and print the indices at which it occurs

import java.util.*;
public class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns:");
        int columns = sc.nextInt();

        int [][] mularray = new int[rows][columns];

        for(int i =0;i<rows;i++){
            for(int j=0; j<columns;j++){
                mularray[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array is: ");
        for(int i =0; i<rows;i++){
            for(int j=0; j<columns;j++){
                System.out.print(mularray[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter the element which you want to search: ");
        int x = sc.nextInt();
        for(int i =0; i<rows;i++){
            for(int j=0; j<columns;j++){
                if(mularray[i][j]==x){
                    System.out.println("Element is found at ("+i+" , "+j+")");
                }
            }
        }

    }
}