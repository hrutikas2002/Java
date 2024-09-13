// program prints an inverted 180-degree pyramid pattern using stars (*).
public class inverted180DegreePyramid {

    public static void main(String[] args) {
        int n =5;
        //outer loop number of rows.
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i;j++){     // inner loop to print n-i spaces for each row
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){        // inner loop to print i stars for row i
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
