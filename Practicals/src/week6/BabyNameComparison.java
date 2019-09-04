package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String[] names = new String[3];
        for(int i=0; i<names.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine();
        }
        for(int i=0; i<names.length; i++){
            if(i+1 < names.length)
                System.out.println(names[i] + " " + names[i+1]);
            if(i+2 < names.length)
                System.out.println(names[i] + " " + names[i+2]);
            if(i-1 >= 0)
                System.out.println(names[i] + " " + names[i-1]);
            if(i-2 >= 0)
                System.out.println(names[i] + " " + names[i-2]);
        }
    }
}
