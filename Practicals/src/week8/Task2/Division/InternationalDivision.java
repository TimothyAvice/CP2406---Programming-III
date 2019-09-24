package week8.Task2.Division;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    InternationalDivision(String name, int accNum, String country, String language) {
        super(name, accNum);
        this.country = country;
        this.language = language;
    }

    @Override
    public String display() {
        return "International Division: " + name + ", Account number: " + accNum+ ", Country: "
                + country + ", Language: " + language;
    }
}
