package week6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        System.out.format("There are %s words in that sentence", tokenizer.countTokens());
    }
}
