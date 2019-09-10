package week6;

import java.util.Scanner;

public class ArrayMethodDemo {
    private int[] numbers = new int[10];

    public static void main(String[] args) {
        ArrayMethodDemo arrayMethodDemo = new ArrayMethodDemo();
    }

    public ArrayMethodDemo(){
        input();
        displayInts();
        displayReverseInts();
        displaySum();
        displayLessThan(10);
        displayHigherAverage();
    }

    private void input(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
    }

    private void displayInts(){
        for (int number : numbers) System.out.print(number + " ");
        System.out.print("\n");
    }

    private void displayReverseInts(){
        for (int i = (numbers.length-1); i >= 0; i--)
            System.out.print(numbers[i] + " ");
        System.out.print("\n");
    }

    private void displaySum(){
        int sum = sum();
        System.out.print("Sum is: " + sum + "\n");
    }

    private int sum(){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private void displayLessThan(int limiter){
        for (int number : numbers) {
            if(number < limiter){
                System.out.print(number + " ");
            }
        }
        System.out.print("\n");
    }

    private int average(){
        return sum()/numbers.length;
    }

    private void displayHigherAverage(){
        int average = average();
        for (int number: numbers) {
            if (number > average)
                System.out.print(number + " ");
        }
        System.out.print("\n");
    }
}
