package week3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static int wins;
    static int count;
    private static Random random = new Random();
    // Secret assigned random value between 1 and 10 inclusive
    static int secret = random.nextInt( 10) + 1;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess between 0 and 10: ");
        int guess = input.nextInt();
        makeGuess(guess);
        if (wins > 0){
            System.out.println("You have won");
        }
        else{
            System.out.println("You have Lost");
        }
    }

    static void  makeGuess(int value){
        count += 1;
        if (value == secret){
            wins += 1;
        }
    }
}
