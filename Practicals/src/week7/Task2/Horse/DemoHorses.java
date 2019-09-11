package week7.Task2.Horse;

public class DemoHorses {
    public static void main(String[] args) {
        Horse horse = new Horse("Stanley", "Bronze", 1998);
        System.out.format("Horse is: %s, Color is: %s, Born in: %s\n"
        ,horse.getName(), horse.getColor(), horse.getBirthYear());

        RaceHorse raceHorse = new RaceHorse("Yasin", "Cream", 8, 192000);
        System.out.format("Horse is: %s, Color is: %s, Born in: %s, Has ridden: %s races\n",
                raceHorse.getName(), raceHorse.getColor(), raceHorse.getBirthYear(), raceHorse.getRaces());

    }
}
