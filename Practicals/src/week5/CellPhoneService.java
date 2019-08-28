package week5;

import javax.swing.*;

public class CellPhoneService {
    public static void main(String[] args) {
        String str, output;
        int talkMinutes, textMessages, data;
        str = JOptionPane.showInputDialog(null, "Enter estimated maximum talk minutes");
        talkMinutes = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter estimated maximum messages");
        textMessages = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter estimated data usage");
        data = Integer.parseInt(str);
        if (talkMinutes < 500  && data == 0) {
            if (talkMinutes == 0){
                output = "Recommended plan\nPlan A: $49";
            JOptionPane.showMessageDialog(null, output);
        }
            else{
                output = "Recommended plan\nPlan B: $55";
                JOptionPane.showMessageDialog(null, output);
            }
        }
        else{
            if (talkMinutes > 500 && data == 0){
                if (textMessages < 100){
                    output = "Recommended plan\nPlan C: $61";
                    JOptionPane.showMessageDialog(null, output);
                }
                if (textMessages >= 100){
                    output = "Recommended plan\nPlan D: $70";
                    JOptionPane.showMessageDialog(null, output);
                }
            }
            else{
                if(data <= 2){
                    output = "Recommended plan\nPlan E: $79";
                    JOptionPane.showMessageDialog(null, output);
                }
                else{
                    output = "Recommended plan\nPlan F: $87";
                    JOptionPane.showMessageDialog(null, output);
                }
            }
        }
    }
}