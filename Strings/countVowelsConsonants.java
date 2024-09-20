// count the number of vowels and consonants in a string

import java.util.*;
public class countVowelsConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        int vowelCount = 0;
        String vowels = "";
        int consoCount =0;
        String consonants = "";

        for(int i =0; i<str.length();i++){
            char c = str.charAt(i);

            if (c=='a' || c=='A'|| c=='e'|| c=='E'|| c=='i'|| c=='I'|| c=='o'|| c=='O'|| c=='u'|| c=='U'){
                vowelCount+=1;
                vowels+=str.charAt(i);
            }else{
                consoCount+=1;
                consonants+=str.charAt(i);
            }       
        }
        System.out.println("Number of vowels: "+vowelCount);
        System.out.println("vowels are: "+vowels);
        System.out.println("Number of consonants: "+consoCount);
        System.out.println("Consonants are: "+consonants);
    }
}
