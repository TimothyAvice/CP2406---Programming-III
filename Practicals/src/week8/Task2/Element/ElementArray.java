package week8.Task2.Element;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[4];
        int[] atNumbers = {13,8,21,9};
        String[] symbols = {"Al", "O", "Ga", "F"};
        double[] atWeights = {26.982, 15.999, 69.732, 18.998};

        for (int i = 0; i < elements.length; i++){
            if (i%2 == 0){
               elements[i] = new NonMetalElement(symbols[i], atNumbers[i], atWeights[i]);
            }
            else{
                elements[i] = new MetalElement(symbols[i], atNumbers[i], atWeights[i]);
            }
            System.out.println(elements[i].describeElement());
        }
    }
}
