/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print (This is Good)
89 >= Marks >= 60 -> print (This is also Good)
59 >= Marks >= 0 -> print (This is Good as well)
	Because marks do not matter but our effort does.
(Hint : use do-while loop but think & understand why)
 */

import java.util.*;
public class studentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice;

       
        do{
            System.out.println("\nEnter the number 0 to exit or 1 to continue.");
            choice = sc.nextInt();
    
            if (choice==1){
                System.out.print("Enter the marks of student out of 100: ");
                int marks = sc.nextInt();

                if (marks >=90){
                    System.out.println("This is good!");
                } else if(89 >= marks && marks >= 60){
                    System.out.println("This is also good");
                } else if (59 >= marks && marks>= 0 ){
                    System.out.println("This is Good as well");
                    System.out.println("Because marks do not matter but our effort does.");
                } else{
                    System.out.println("Enter valid value for marks! Try again");
                }
            }
        }while(choice!=0);
        
        System.out.println("Program Exited! Thank You....");
        
    }
}
