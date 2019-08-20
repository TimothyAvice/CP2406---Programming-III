package week4;

public class Sandwich {
    private String ingredient;
    private String bread;
    private double price;

    public void setIngredient(String ing) {
        ingredient = ing;
    }

    public void setBread(String type) {
        bread = type;
    }

    public void setPrice(double amount) {
        price = amount;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }
}
