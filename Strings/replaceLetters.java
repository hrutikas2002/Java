// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.*;
public class replaceLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("String before replacement of characters: "+str);

        String result = "";

        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='e'){
                result = result+"i";
            }else{
                result=result+str.charAt(i);
            }
        }

        System.out.println("String after replacement: "+result);
    }
}
