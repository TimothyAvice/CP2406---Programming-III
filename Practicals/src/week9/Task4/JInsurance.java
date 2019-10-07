package week9.Task4;

import javax.swing.*;
import java.awt.*;

public class JInsurance {
    private int total = 0;
    private int typeCost = 0;
    private int insuranceCost = 0;

    private JInsurance() {
        // Framework
        JFrame jFrame = new JFrame("Insurance");
        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));
        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        // Creating type options
        JRadioButton HMO = new JRadioButton("HMO");
        JRadioButton PPO = new JRadioButton("PPO");
        ButtonGroup insurance = new ButtonGroup();
        insurance.add(HMO);
        insurance.add(PPO);

        // Creating insurance options
        JCheckBox dental = new JCheckBox("Dental Insurance");
        JCheckBox vision = new JCheckBox("Vision Insurance");

        // Creating cost lables
        JLabel totalLabel = new JLabel("Total:");
        JLabel totalText = new JLabel();

        // Adding window content
        JLabel description = new JLabel("");
        description.setAlignmentX(Component.CENTER_ALIGNMENT);

        top.add(HMO);
        top.add(PPO);
        middle.add(dental);
        middle.add(vision);
        bottom.add(totalLabel);
        bottom.add(totalText);
        jFrame.getContentPane().add(top);
        jFrame.getContentPane().add(middle);
        jFrame.add(description);
        jFrame.getContentPane().add(bottom);
        jFrame.pack();

        // Handling type selection
        HMO.addActionListener(actionEvent -> {
            if(HMO.isSelected()) {
                description.setText("HMO Costs $200 per month");
                typeCost = 200;
            }
            total = typeCost + insuranceCost;
            totalText.setText("$" + total);
        });

        PPO.addActionListener(actionEvent -> {
            if(PPO.isSelected()) {
                description.setText("PPO Costs $600 per month");
                typeCost = 600;
            }
            total = typeCost + insuranceCost;
            totalText.setText("$" + total);
        });

        // Handling insurance selection
        dental.addActionListener(actionEvent -> {
            if(dental.isSelected() && vision.isSelected()){
                description.setText("Both options add $95 per month");
                insuranceCost = 95;
            } else if(dental.isSelected()){
                description.setText("Dental Coverage Adds $75 per month");
                insuranceCost = 75;
            } else if (!dental.isSelected() && !vision.isSelected()){
                description.setText("");
                insuranceCost = 0;
            } else if (vision.isSelected() && !dental.isSelected()){
                description.setText("Vision Care Adds $20 per month");
                insuranceCost = 20;
            }
            total = typeCost + insuranceCost;
            totalText.setText("$" + total);
        });

        vision.addActionListener(actionEvent -> {
            if(dental.isSelected() && vision.isSelected()){
                description.setText("Both options add $95 per month");
                insuranceCost = 95;
            } else if(vision.isSelected() && !dental.isSelected()){
                description.setText("Vision Care Adds $20 per month");
                insuranceCost = 20;
            } else if (!dental.isSelected() && !vision.isSelected()){
                description.setText("");
                insuranceCost = 0;
            } else if (!vision.isSelected() && dental.isSelected()){
                description.setText("Dental Coverage Adds $75 per month");
                insuranceCost = 75;
            }
            total = typeCost + insuranceCost;
            totalText.setText("$" + total);
        });
    }

    public static void main(String[] args) {
        new JInsurance();
    }
}
