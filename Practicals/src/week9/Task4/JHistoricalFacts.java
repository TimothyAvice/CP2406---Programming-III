package week9.Task4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JHistoricalFacts{
    private JLabel[] facts = new JLabel[5];
    private String[] factsContent = {"1821 AD - Death of Napolean", "753 BC - Foundation of Rome",
            "1914 AD - WW1", "375 AD - Huns' invade Europe", "214 AD - Great wall of China construction begins",
            "1939 AD - WW2", "1969 AD - Moon landing", "1865 AD - Abraham Lincoln assassinated"};

    private JHistoricalFacts() {
        // Building frame work
        JFrame jFrame = new JFrame("Historical facts");
        JPanel container = new JPanel(new GridLayout(6,1));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,600);
        jFrame.setVisible(true);

        // Contents
        JButton button = new JButton("Generate new fact");
        container.add(button);
        for (int i=0; i<facts.length; i++){
            facts[i] = new JLabel(factsContent[i]);
            facts[i].setHorizontalAlignment(JLabel.CENTER);
            container.add(facts[i]);
        }
        jFrame.setContentPane(container);

        // Change labels
        button.addActionListener(actionEvent -> {
            Random random = new Random();
            int labelNum = random.nextInt(5);
            int factNum = random.nextInt(8);
            facts[labelNum].setText(factsContent[factNum]);
        });
    }

    public static void main(String[] args) {
        new JHistoricalFacts();
    }
}
