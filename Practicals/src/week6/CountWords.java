package week6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {
        char[] specialChars = {'.', '!', '-', '/'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        StringBuilder newSentence = new StringBuilder(sentence);
        for (int i = 0; i < sentence.length(); ++i){
            for (char specialChar : specialChars)
                if (sentence.charAt(i) == specialChar) {
                    newSentence.setCharAt(i, '\0');
                }
        }
        sentence = newSentence.toString();
        StringTokenizer updatedSentence = new StringTokenizer(sentence);
        System.out.format("There are %s words in that sentence", updatedSentence.countTokens());
    }
}
