package week9.Task4;

import javax.swing.*;
import java.awt.*;

public class JVacationRental {

    private JComboBox<String> locations = new JComboBox<>();
    private JComboBox<String> bedrooms = new JComboBox<>();
    private JComboBox<String> meals = new JComboBox<>();
    private int priceL = 0;
    private int priceB = 0;
    private int priceM = 0;

    private JVacationRental() {
        // Framework
        JFrame jFrame = new JFrame("Vacation Rental");
        JPanel container = new JPanel(new GridLayout(0,3));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,600);
        jFrame.setVisible(true);

        JLabel priceText = new JLabel("$0");
        JLabel locationTitle = new JLabel("Choose Location:");
        JLabel bedroomTitle = new JLabel("Num Bedrooms:");
        JLabel mealsTitle = new JLabel("Meals included?");

        // Creating window
        container.add(locationTitle);
        container.add(bedroomTitle);
        container.add(mealsTitle);
        container.add(locations);
        container.add(bedrooms);
        container.add(meals);
        container.add(priceText);
        jFrame.setContentPane(container);
        locations.addItem("Park side"); locations.addItem("Pool side"); locations.addItem("Lake side");
        bedrooms.addItem("One"); bedrooms.addItem("Two"); bedrooms.addItem("Three");
        meals.addItem("Yes");meals.addItem("No");

        locations.addActionListener(actionEvent -> {
            String selectedLocation = (String) locations.getSelectedItem();
            assert selectedLocation != null;
            switch (selectedLocation){
                case "Park side":
                    priceL = 600;
                    break;
                case "Pool side":
                    priceL = 750;
                    break;
                case "Lake side":
                    priceL = 825;
                    break;
            }
        });

        bedrooms.addActionListener(actionEvent -> {
            String selectedBedrooms = (String) bedrooms.getSelectedItem();
            assert selectedBedrooms != null;
            switch (selectedBedrooms){
                case "One":
                    priceB = 0;
                    break;
                case "Two":
                    priceB = 75;
                    break;
                case "Three":
                    priceB = 150;
                    break;
            }
        });

        meals.addActionListener(actionEvent -> {
            String selectedMeals = (String) meals.getSelectedItem();
            assert selectedMeals != null;
            switch (selectedMeals){
                case "Yes":
                    priceM = 200;
                    break;
                case "No":
                    priceM = 0;
                    break;
            }
            int totPrice = priceB + priceL + priceM;
            priceText.setText("$" + totPrice);
        });
    }

    public static void main(String[] args) {
        new JVacationRental();
    }
}
