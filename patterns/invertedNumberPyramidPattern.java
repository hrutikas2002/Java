// program prints an inverted pyramid pattern using numbers. 

import java.util.*;
public class invertedNumberPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = n; i>=1;i--){       //  Starts from n and decreases down to 1
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
 
    

