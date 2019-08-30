package week5;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        int counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to count by: ");
        int countby = input.nextInt();
        for(int i = 3; i <= 300; i += countby){
            System.out.print(i + " ");
            if (counter%10 == 0){
                System.out.print("\n");
            }
            counter++;
        }
    }
}
