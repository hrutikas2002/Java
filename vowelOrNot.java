//  Java program checks whether a given letter is a vowel using a switch statement and prints the result.
import java.util.*;
public class vowelOrNot {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the letter: ");
        char letter = sc.next().charAt(0);

        letter = Character.toLowerCase(letter);

        switch (letter) {
            case 'a': 
            case 'e':
            case'i':
            case 'o':
            case 'u':
            System.out.println("Letter is vowel.");
            break;
        
            default:
            System.out.println("Letter is not vowel.");
                break;
        }

    }
    
}
