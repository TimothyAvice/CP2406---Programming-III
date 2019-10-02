package week9.Task4;

import javax.swing.*;

public class JFrameDisableButton2 extends JFrame{
    private int counter = 0;

    private JFrameDisableButton2() {
        setTitle("Disable button 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Button");
        JLabel label = new JLabel("");
        JLabel count = new JLabel(String.valueOf(counter));
        add(button);
        add(label);
        add(count);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
        button.addActionListener(actionEvent -> {
            counter++;
            count.setText(String.valueOf(counter));
            if (counter == 8) {
                button.setEnabled(false);
                label.setText("THAT'S ENOUGH!");
            }
        });
    }

    public static void main(String[] args) {
        new JFrameDisableButton2();
    }
}
