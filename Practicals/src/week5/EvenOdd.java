package week5;

import javax.swing.*;

public class EvenOdd {
    public static void main(String[] args){
        String str, output;
        int number;
        str = JOptionPane.showInputDialog(null,"Enter a number");
        number = Integer.parseInt(str);
        if (number%2 == 0)
            output = "Number is even";
        else
            output = "Number is odd";
        JOptionPane.showMessageDialog(null, output);
    }
}
