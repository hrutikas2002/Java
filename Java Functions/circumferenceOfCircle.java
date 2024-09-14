// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class circumferenceOfCircle {
    public static void calculateCircumference(float r){
        double circumference = 2*3.14*r;
        System.out.println("Circumference of the circle is: "+circumference);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float r = scan.nextInt();

        calculateCircumference(r);
    }
}
