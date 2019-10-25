package week12.Task2;

import javax.swing.*;
import java.awt.*;

public class JDiagonalLinesPanel extends JPanel {
    private int distance;
    private int distance2;
    private int squareSize = 200;
    private int numLines = 10;

    public JDiagonalLinesPanel() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        distance = squareSize/numLines;
        distance2 = squareSize/numLines;
        g.setColor(Color.BLUE);
        g.drawRect((getWidth() - squareSize)/2, (getHeight() - squareSize)/2, squareSize, squareSize);
        for (int i = 0; i < numLines*2; i++){
            if (i < numLines) {
                g.drawLine((getWidth() - squareSize) / 2, ((getHeight() - squareSize) / 2) + distance,
                        ((getWidth() - squareSize) / 2) + distance, ((getHeight() - squareSize) / 2));
                distance += squareSize / numLines;
            }
            else {
                g.drawLine(((getWidth() + squareSize) / 2) - distance2, ((getHeight() + squareSize) / 2),
                        ((getWidth() + squareSize) / 2), ((getHeight() + squareSize) / 2) - distance2);
                distance2 += squareSize / numLines;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JDiagonalLinesPanel());
        frame.setPreferredSize(new Dimension(500,500));
        frame.pack();
    }
}
