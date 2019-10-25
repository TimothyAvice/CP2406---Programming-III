package week12.Task2;

import javax.swing.*;
import java.awt.*;

public class JNestedCirclePanel extends JPanel {
    private int radius = 4;
    private int sizeIncrement = 14;
    private int numCircles = 15;

    public JNestedCirclePanel() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i <= numCircles; i++){
            g.setColor(Color.BLUE);
            g.drawOval((getWidth() - radius)/2, (getHeight() - radius)/2, radius, radius);
            radius += sizeIncrement;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JNestedCirclePanel());
        frame.setPreferredSize(new Dimension(500,500));
        frame.pack();
    }
}
