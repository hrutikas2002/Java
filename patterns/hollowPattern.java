// This program prints a hollow rectangle pattern of `*` based on the number of rows (`n`) and columns (`m`) entered by the user. The `*` is printed only at the boundary (first and last rows/columns), while the inner area is filled with spaces.

import java.util.*;
public class hollowPattern{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
       int n = sc.nextInt();
       System.out.print("Enter the number of columns: ");
       int m = sc.nextInt();

       //outer loop: number of rows
       for (int i=1; i<=n; i++){
        //inner loop: Number of columns
        for (int j=1; j<=m; j++){

            // whenever row and column is first and last then print *
            if (i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }else{
                System.out.print(" ");    // else keep it blank
            }
        }
        System.out.println();
       }
    }
}