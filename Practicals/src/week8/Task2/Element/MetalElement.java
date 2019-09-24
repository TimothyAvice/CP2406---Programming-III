package week8.Task2.Element;

public class MetalElement extends Element {

    MetalElement(String symbol, int atNumber, double atWeight) {
        super(symbol, atNumber, atWeight);
    }

    @Override
    public String describeElement() {
        return atNumber + "\n" + symbol + "\n" + atWeight + "\nMetals are good conductors of electricity";
    }
}
