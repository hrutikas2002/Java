//concatinating two strings

import java.util.*;
public class concatenationString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fname = scan.nextLine();

        System.out.print("Enter last name: ");
        String lname = scan.nextLine();

        String fullname = fname + " "+lname;
        System.out.println(fullname);
    }
}
