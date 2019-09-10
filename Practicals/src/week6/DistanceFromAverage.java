package week6;

import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        double input;
        double sum = 0;
        double average = 0;
        double dist;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (Enter 99999 to stop): ");
        input = scanner.nextDouble();
        numbers.add(input);
        while(numbers.size() != 0 && input != 99999){
            numbers.add(input);
            System.out.print("Enter a number (Enter 99999 to stop): ");
            input = scanner.nextDouble();
        }

        for (Double number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        if(numbers.size() != 0) {
            average = sum / numbers.size();
        }

        for (Double number : numbers) {
            if (number < average)
                dist = average - number;
            else
                dist = number - average;
            System.out.format("Number: %.2f\nAverage: %.2f\nDist from average: %.2f\n",
                    number, average, dist);
        }
    }
}
