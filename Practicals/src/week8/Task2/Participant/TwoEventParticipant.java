package week8.Task2.Participant;

import java.util.Scanner;

public class TwoEventParticipant {
    public static void main(String[] args) {
        String tName;
        int tAge;
        String tAddress;
        Participant[] miniMarathon = new Participant[8];
        Participant[] diving = new Participant[8];

        for (int i = 0; i < miniMarathon.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter contestant " + (i+1) + "'s details for the mini-marathon:");
            System.out.print("Name: ");
            tName = scanner.nextLine();
            System.out.print("Address: ");
            tAddress = scanner.nextLine();
            System.out.print("Age: ");
            tAge = scanner.nextInt();
            miniMarathon[i] = new Participant(tName, tAge, tAddress);
        }

        for (int i = 0; i < diving.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter contestant " + (i+1) + "'s details for the diving competition:");
            System.out.print("Name: ");
            tName = scanner.nextLine();
            System.out.print("Address: ");
            tAddress = scanner.nextLine();
            System.out.print("Age: ");
            tAge = scanner.nextInt();
            diving[i] = new Participant(tName, tAge, tAddress);
        }

        for (Participant value : miniMarathon) {
            for (Participant participant : diving) {
                if (value.equals(participant.name, participant.age, participant.address)) {
                    System.out.println("Mini-marathon\n" + value.toString());
                    System.out.println("Diving competition\n" + participant.toString());
                }
            }
        }
    }
}
