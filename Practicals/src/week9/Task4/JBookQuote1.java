package week9.Task4;

import javax.swing.*;
import java.awt.*;

public class JBookQuote1 extends JFrame {

    private JBookQuote1(){
        super("Quote");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        add(new JLabel("Power a blessing in disguise? - https://inspirobot.me/"));
    }

    public static void main(String[] args)
    {
        new JBookQuote1();
    }
}
