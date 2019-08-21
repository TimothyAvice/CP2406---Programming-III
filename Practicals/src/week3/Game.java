package week3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int wins;
    int count;
    private static Random random = new Random();
    // Secret assigned random value between 1 and 10 inclusive
    int secret;

    public Game(int min, int max){
        secret = min + random.nextInt(max-min + 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Game game = new Game(1,10);
        System.out.print("Enter a guess between 0 and 10: ");
        int guess = input.nextInt();
        game.makeGuess(guess);
        if (game.wins > 0){
            System.out.println("You have won");
        }
        else{
            System.out.println("You have Lost");
        }
    }

    void  makeGuess(int value){
        count += 1;
        if (value == secret){
            wins += 1;
        }
    }
}
