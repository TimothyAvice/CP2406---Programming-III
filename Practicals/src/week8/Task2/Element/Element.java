package week8.Task2.Element;

public abstract class Element {
    String symbol;
    int atNumber;
    double atWeight;

    Element(String symbol, int atNumber, double atWeight) {
        this.symbol = symbol;
        this.atNumber = atNumber;
        this.atWeight = atWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtNumber() {
        return atNumber;
    }

    public double getAtWeight() {
        return atWeight;
    }

    public abstract String describeElement();
}
