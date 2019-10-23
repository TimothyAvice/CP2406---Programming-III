package week10.Task2;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Font font = new Font("Arial", Font.PLAIN, 20);
        Color background = new Color(255,20,147);
        Color foreground = new Color(0,0,0);
        JFlexiblePanel panel = new JFlexiblePanel(background,foreground,font,"This is my text");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.add(panel);
        jFrame.pack();
    }
}
