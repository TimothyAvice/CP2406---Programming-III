package week8.Task2.Participant;

public class Participant {
    String name;
    int age;
    String address;

    Participant(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString(){
        return String.format("Name: %s, Age: %d, Address: %s", name, age, address);
    }

    boolean equals(String name, int age, String address){
        return this.name.equals(name) && this.age == age && this.address.equals(address);
    }

}
