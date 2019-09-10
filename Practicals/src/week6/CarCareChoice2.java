package week6;

import java.util.Arrays;
import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        String input;
        String shorthand = "vwe";

        Scanner scanner = new Scanner(System.in);
        String[] services = {"oil change", "tire rotation", "battery check",
        "brake inspection"};
        String[] shortservice = {"oil", "tir", "bat", "bra"};
        do {
            System.out.println("Select service. Services are :");
            for (String service: services)
                System.out.println(service);
            System.out.print("Choice: ");
            input = scanner.nextLine();
            for (int i = 0; i < shorthand.length(); i++){
                shorthand = shorthand.replace(shorthand.charAt(i), input.charAt(i));
            }
        }while (!Arrays.asList(shortservice).contains(shorthand));


        switch (shorthand){
            case "oil":
                System.out.println("Choice was: " + services[0]);
                System.out.println("Price is: $25");
                break;
            case "tir":
                System.out.println("Choice was: " + services[1]);
                System.out.println("Price is: $22");
                break;
            case "bat":
                System.out.println("Choice was: " + services[2]);
                System.out.println("Price is: $15");
                break;
            case "bra":
                System.out.println("Choice was: " + services[3]);
                System.out.println("Price is: $5");
                break;
        }
    }
}
