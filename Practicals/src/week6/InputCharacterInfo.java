package week6;

import java.util.Scanner;

public class InputCharacterInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char character = scanner.next().charAt(0);
        System.out.println("The character is " + character);
        if(Character.isUpperCase(character))
            System.out.println(character + " is uppercase");
        else
            System.out.println(character + " is not uppercase");
        if(Character.isLowerCase(character))
            System.out.println(character + " is lowercase");
        else
            System.out.println(character + " is not lowercase");
        character = Character.toLowerCase(character);
        System.out.println("After toLowerCase(), character is " + character);
        character = Character.toUpperCase(character);
        System.out.println("After toUpperCase(), character is " + character);
        if(Character.isLetterOrDigit(character))
            System.out.println(character + " is a letter or digit");
        else
            System.out.println(character + " is neither a letter nor a digit");
        if(Character.isWhitespace(character))
            System.out.println(character + " is whitespace");
        else
            System.out.println(character + " is not whitespace");
    }
}
