package week12.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSizesPanel extends JPanel implements ActionListener {
    JButton button = new JButton("Change size");
    JLabel label = new JLabel("");
    int currentSize = 6;

    public JFontSizesPanel() {
        setLayout(new GridLayout(0,1));
        label.setPreferredSize(new Dimension(400, 100));
        button.setPreferredSize(new Dimension(400, 50));
        add(button);
        add(label);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (currentSize < 20)
            currentSize++;
        else
            currentSize = 6;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, currentSize));
        g.setColor(Color.BLUE);
        g.drawString("Text", label.getX() + 10, label.getY()+80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JFontSizesPanel());
        frame.pack();
    }
}
