package week8.Task2.Division;

public abstract class Division {
    String name;
    int accNum;

    Division(String name, int accNum){
        this.name = name;
        this.accNum = accNum;
    }

    public abstract String display();
}
