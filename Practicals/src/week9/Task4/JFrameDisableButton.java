package week9.Task4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton {


    public JFrameDisableButton() {
        JFrame jFrame = new JFrame("Disable button");
        jFrame.setSize(350, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JButton button = new JButton("Disable");
        jFrame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Is Disabled");
                button.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        new JFrameDisableButton();
    }
}
