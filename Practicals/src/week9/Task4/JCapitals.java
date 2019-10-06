package week9.Task4;

import javax.swing.*;
import java.awt.*;

public class JCapitals {
    private String[] cities = {"Perth", "Adelaide", "Darwin", "Brisbane", "Melbourne", "Sydney", "Canberra"};
    private JComboBox<String> countriesDrop = new JComboBox<>();

    private JCapitals() {
        // Framework
        JFrame jFrame = new JFrame("Capitals");
        JPanel container = new JPanel(new GridLayout(2,1));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,600);
        jFrame.setVisible(true);

        JLabel city = new JLabel("");

        String[] countries = {"Western Australia", "South Australia", "Northern Territory", "Queensland",
                "Victoria", "New South Whales", "Australia Capital Territory"};
        for (String country : countries) {
            countriesDrop.addItem(country);
        }

        container.add(countriesDrop);
        container.add(city);
        jFrame.setContentPane(container);

        countriesDrop.addActionListener(actionEvent -> city.setText(cities[countriesDrop.getSelectedIndex()]));
    }

    public static void main(String[] args) {
        new JCapitals();
    }
}
