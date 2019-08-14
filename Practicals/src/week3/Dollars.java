package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        int dollars;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dollar amount: $");
        dollars = input.nextInt();
        int twenties = dollars/20;
        int remainder1 = dollars%20;
        int tens = remainder1/10;
        int remainder2 = remainder1%10;
        int fives = remainder2/5;
        int ones = remainder2%5;
        System.out.println("20s: " + twenties);
        System.out.println("10s: " + tens);
        System.out.println("5s: " + fives);
        System.out.println("1s: " + ones);
    }
}