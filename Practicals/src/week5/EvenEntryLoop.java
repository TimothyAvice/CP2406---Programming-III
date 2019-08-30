package week5;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        final int SENTINEL = 999;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while (number != SENTINEL){
            if (number%2 == 0)
                System.out.println("Good Job");
            else
                System.out.println("Error");
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }
        System.out.print("Sentinel entered");
    }
}
