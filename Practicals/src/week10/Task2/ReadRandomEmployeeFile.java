package week10.Task2;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadRandomEmployeeFile {
    private int employeeID;
    private String name;
    private double wage;

    private ReadRandomEmployeeFile() {
        JFrame jFrame = new JFrame("Create Random Employee File");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLayout(new GridLayout(0,3));

        // Labels
        JLabel numberLabel = new JLabel("Enter Employee ID:");
        JLabel nameLabel = new JLabel("Enter full name");
        JLabel wageLabel = new JLabel("Enter wage");
        // TextFields
        JTextField numberText = new JTextField();
        JTextField nameText = new JTextField();
        JTextField wageText = new JTextField();
        // Buttons
        JButton numberButton = new JButton("Submit");
        JButton nameButton = new JButton("Submit");
        JButton wageButton = new JButton("Submit");

        JButton createFile = new JButton("CreateFile");
        JButton close = new JButton("Close");
        JButton search = new JButton("Search for employee info");

        // Add components to frame
        jFrame.add(numberLabel); jFrame.add(numberText); jFrame.add(numberButton);
        jFrame.add(nameLabel); jFrame.add(nameText); jFrame.add(nameButton);
        jFrame.add(wageLabel); jFrame.add(wageText); jFrame.add(wageButton);
        jFrame.add(createFile); jFrame.add(close); jFrame.add(search);

        // Disable other 2 fields at start and create file button
        nameText.setEnabled(false); nameButton.setEnabled(false);
        wageText.setEnabled(false); wageButton.setEnabled(false);
        createFile.setEnabled(false);

        // Handle employeeID entering
        numberButton.addActionListener(actionEvent -> {
            employeeID = Integer.parseInt(numberText.getText());
            if (employeeID >= 1 && employeeID <= 99){
                int option = JOptionPane.showConfirmDialog(jFrame, "EmployeeID: " + employeeID +
                        "\nIs this correct?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION){
                    numberText.setEnabled(false); numberButton.setEnabled(false);
                    nameText.setEnabled(true); nameButton.setEnabled(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(jFrame, "Error: EmployeeID has to be between 1 and 99");
            }
        });

        // Handle name entering
        nameButton.addActionListener(actionEvent -> {
            name = nameText.getText();
            int option = JOptionPane.showConfirmDialog(jFrame, "Name: " + name +
                    "\nIs this correct?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION){
                nameText.setEnabled(false); nameButton.setEnabled(false);
                wageText.setEnabled(true); wageButton.setEnabled(true);
            }
        });

        // Handle wage entering
        wageButton.addActionListener(actionEvent -> {
            wage = Double.parseDouble(wageText.getText());
            int option = JOptionPane.showConfirmDialog(jFrame, "Wage: $" + wage +
                    " per Hour\nIs this correct?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION){
                wageText.setEnabled(false); wageButton.setEnabled(false);
                createFile.setEnabled(true);
            }
        });

        // Handles the saving of the file
        createFile.addActionListener(actionEvent -> {
            String fileName = JOptionPane.showInputDialog(jFrame,"Save file as:");
            try {
                FileWriter file = new FileWriter(".\\Practicals\\src\\week10\\Task2\\"+
                        fileName + ".csv", StandardCharsets.UTF_8);
                file.append("EmployeeID");file.append(',');file.append("Name"); file.append(',');file.append("Wage");
                file.append('\n');
                file.append(String.valueOf(employeeID));file.append(',');file.append(name);file.append(',');
                file.append(String.valueOf(wage));file.append('\n');
                file.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(jFrame, "File has been created");
        });

        // Handles the searching
        search.addActionListener(actionEvent -> {
            JTextField number = new JTextField();
            JTextField fileName = new JTextField();
            Object[] inputs = {"EmployeeID",number, "FileName (In current directory)", fileName};
            int option = JOptionPane.showConfirmDialog(jFrame,inputs,"Details", JOptionPane.OK_CANCEL_OPTION);
            if(option == JOptionPane.OK_OPTION){
                try {
                    String line;
                    BufferedReader reader = new BufferedReader(new
                            FileReader(".\\Practicals\\src\\week10\\Task2\\" + fileName.getText()));
                    while ((line = reader.readLine()) != null){
                        String[] info = line.split(",");
                        if(info[0].equals(number.getText())){
                            JOptionPane.showMessageDialog(jFrame, String.format("Employee ID: %s\nName: %s\nWage: %s",
                                    info[0], info[1], info[2]));
                            break;
                        }
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        close.addActionListener(actionEvent -> System.exit(0));

        jFrame.pack();
    }

    public static void main(String[] args) {
        new ReadRandomEmployeeFile();
    }
}
