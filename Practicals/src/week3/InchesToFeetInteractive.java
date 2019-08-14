package week3;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args){
        int inches;
        int feet;
        int remainingInches;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inches: ");
        inches = input.nextInt();
        feet = inches/12;
        remainingInches = inches%12;
        System.out.printf("That is equal to: %d feet %d inches", feet, remainingInches);
    }

}
