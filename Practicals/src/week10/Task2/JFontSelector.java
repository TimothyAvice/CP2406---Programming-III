package week10.Task2;

import week9.Task4.JFrameDisableButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector implements ActionListener {
    private String selection = "Arial";
    private int size = 16;
    // Buttons
    private JButton comic = new JButton("Comic Sans MS");
    private JButton serif = new JButton("Sans Serif");
    private JButton roman = new JButton("Times New Romans");
    private JButton arial = new JButton("Arial");
    private JButton castellar = new JButton("Castellar");
    private JButton increaseSize = new JButton("Press to increase font size");
    private JButton decreaseSize = new JButton("Press to decrease font size");
    private JLabel label = new JLabel("Font type | Size");

    private JFontSelector() {
        // Framework
        JFrame jFrame = new JFrame("Font Selector");
        jFrame.setLayout(new GridLayout(2,1));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        // Creating panels
        JPanel top = new JPanel(new BorderLayout());
        JPanel bottom = new JPanel(new GridLayout(3,1));
        label.setHorizontalAlignment(JLabel.CENTER);

        // Setting button fonts
        serif.setFont(new Font("Sans Serif", Font.PLAIN,size));
        comic.setFont(new Font("Comic Sans MS", Font.PLAIN, size));
        roman.setFont(new Font("Times New Roman", Font.PLAIN, size));
        arial.setFont(new Font("Arial", Font.PLAIN, size));
        castellar.setFont(new Font("Castellar", Font.PLAIN,size));

        // Setting up button action listeners
        serif.addActionListener(this);
        comic.addActionListener(this);
        roman.addActionListener(this);
        arial.addActionListener(this);
        castellar.addActionListener(this);
        increaseSize.addActionListener(this);
        decreaseSize.addActionListener(this);

        // Adding buttons to top panel
        top.add(serif, BorderLayout.NORTH);
        top.add(comic, BorderLayout.CENTER);
        top.add(roman, BorderLayout.EAST);
        top.add(arial, BorderLayout.WEST);
        top.add(castellar, BorderLayout.SOUTH);

        // Adding content to bottom panel
        bottom.add(increaseSize);
        bottom.add(decreaseSize);
        bottom.add(label);

        // Adding panels to frame
        jFrame.add(top);
        jFrame.add(bottom);
        jFrame.pack();

    }

    public static void main(String[] args) {
        new JFontSelector();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == serif)
            selection = "Sans Serif";
        else if (source == arial)
            selection = "Arial";
        else if (source == comic)
            selection = "Comic Sans MS";
        else if (source == roman)
            selection = "Times New Roman";
        else if (source == castellar)
            selection = "Castellar";
        else if (source == increaseSize){
            size += 2;
            updateFont();
            label.setText(selection + " | " + size);
        }
        else if (source == decreaseSize){
            size -= 2;
            updateFont();
            label.setText(selection + " | " + size);
        }
    }

    private void updateFont(){
        switch (selection){
            case "Sans Serif":
                serif.setFont(new Font("Sans Serif", Font.PLAIN,size));
                break;
            case "Arial":
                arial.setFont(new Font("Arial", Font.PLAIN, size));
                break;
            case "Comic Sans MS":
                comic.setFont(new Font("Comic Sans MS", Font.PLAIN, size));
                break;
            case "Times New Roman":
                roman.setFont(new Font("Times New Roman", Font.PLAIN, size));
                break;
            case "Castellar":
                castellar.setFont(new Font("Castellar", Font.PLAIN,size));
                break;
        }
    }
}
