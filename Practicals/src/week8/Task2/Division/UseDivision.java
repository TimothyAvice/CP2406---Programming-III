package week8.Task2.Division;

public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision domestic = new DomesticDivision("Tiger", 3987, "Queensland");
        InternationalDivision international = new InternationalDivision("Leopard",
                9107, "Australia", "Australian");

        System.out.println(domestic.display());
        System.out.println(international.display());
    }
}
