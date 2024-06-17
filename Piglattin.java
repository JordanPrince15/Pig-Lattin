import java.util.ArrayList;
import java.util.Scanner;

public class Piglattin {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in); // This scanner is the user-input 
        System.out.println("Enter a sentence...");

        String Sentence = userInput.nextLine(); // This assigns the user input the variable name Sentence
        String[] Reg = Sentence.split(""); // This line of code splits the user input at each character
        
        @SuppressWarnings("rawtypes")
        ArrayList Piggy = new ArrayList(); // This the array that contains all of the Piglatin concatenations
        Piggy.add("ay"); //ay is for all words that start with a consonant 
        Piggy.add("way"); // way is for all words that start with a vowel 


        String[] result = new String[Reg.length-1]; // Creates an empty array, that can hold the total length of the user input, so that we can build up our new sentence
        System.arraycopy(Reg, 1, result, 0, result.length);
     
        StringBuilder parts = new StringBuilder();
        for (String s: result) {
            parts.append(s);    
        }

        String str = parts.toString();
        System.out.println(str+Reg[0].toLowerCase() + Piggy.get(0));
    }

}


