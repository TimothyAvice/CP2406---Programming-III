package week10.Task2;

import javax.swing.*;
import java.awt.*;

class JFlexiblePanel extends JPanel {

    JFlexiblePanel(Color background, Color foreground, Font font, String text) {
        JLabel label = new JLabel(text);
        setLayout(new BorderLayout());
        label.setFont(font);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label, BorderLayout.CENTER);
        setBackground(background);
        label.setForeground(foreground);
    }
}
