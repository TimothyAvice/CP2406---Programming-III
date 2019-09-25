package week9.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame {

    public JBookQuote2(){
        super("Quote");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setVisible(true);
        JLabel quote = new JLabel("Hello");
        JButton button = new JButton("Click to show quote");
        add(button);
        add(quote);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                quote.setText("Try to be an idiot - https://inspirobot.me/");
            }
        });
    }

    public static void main(String[] args) {
        new JBookQuote2();
    }
}
