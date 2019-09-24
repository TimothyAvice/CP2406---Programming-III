package week8.Task2.Element;

public class NonMetalElement extends Element {

    NonMetalElement(String symbol, int atNumber, double atWeight) {
        super(symbol, atNumber, atWeight);
    }

    @Override
    public String describeElement() {
        return atNumber + "\n" + symbol + "\n" + atWeight + "\nNonMetals are poor conductors of electricity";
    }
}
