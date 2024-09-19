// Declaration of string in java

import java.util.*;
public class stringsDeclaration{
    public static void main(String args[]){

        //Define string in program
        String name = "Hrutika Suryawanshi";
        System.out.println(name);

        // Take string from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name1 = sc.nextLine();
        System.out.println("Hello "+name1);
    }
}