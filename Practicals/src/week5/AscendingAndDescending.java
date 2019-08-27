package week5;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter the second number: ");
        numbers[1] = input.nextInt();
        System.out.print("Enter the third number: ");
        numbers[2] = input.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tempval = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempval;
                }
            }
            System.out.println(numbers[i]);
        }
        for (int i = numbers.length-1; i >= 0; i--)
            System.out.println(numbers[i]);
    }
}
