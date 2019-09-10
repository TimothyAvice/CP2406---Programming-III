package week6;

import java.util.Arrays;
import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        String input;

        Scanner scanner = new Scanner(System.in);
        String[] services = {"Oil change", "Tire rotation", "Battery check",
        "Brake inspection"};
        do {
            System.out.println("Select service. Services are :");
            for (String service: services)
                System.out.println(service);
            System.out.print("Choice: ");
            input = scanner.nextLine();
        }while (!Arrays.asList(services).contains(input));


        switch (input){
            case "Oil change":
                System.out.println("Choice was: " + services[0]);
                System.out.println("Price is: $25");
                break;
            case "Tire rotation":
                System.out.println("Choice was: " + services[1]);
                System.out.println("Price is: $22");
                break;
            case "Battery check":
                System.out.println("Choice was: " + services[2]);
                System.out.println("Price is: $15");
                break;
            case "Brake inspection":
                System.out.println("Choice was: " + services[3]);
                System.out.println("Price is: $5");
                break;
        }
    }
}
