package week8.Task2.Division;

public class DomesticDivision extends Division {
    private String state;

    DomesticDivision(String name, int accNum, String state) {
        super(name, accNum);
        this.state = state;
    }

    @Override
    public String display() {
        return "Domestic Division: " + name + ", Account number: " + accNum+ ", State: " + state;
    }
}
