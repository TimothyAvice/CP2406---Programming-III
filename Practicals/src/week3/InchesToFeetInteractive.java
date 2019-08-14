package week3;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args){
        float inches;
        float feet;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inches: ");
        inches = input.nextInt();
        feet = inches/12;
        System.out.print("The number of feet is: " + feet);
    }

}
