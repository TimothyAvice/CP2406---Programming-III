package week10.Task2;

import javax.swing.*;
import java.awt.*;

public class JEMail2 {

    private JEMail2() {
        // Framework
        JFrame jFrame = new JFrame("Email");
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));

        // Text fields
        JTextField toText = new JTextField(40);
        JTextField subjectText = new JTextField(40);
        JTextArea messageText = new JTextArea(30,40);
        JScrollPane messageTextScroll = new JScrollPane(messageText);
        // Buttons
        JButton send = new JButton("Send Email");
        JButton clear = new JButton("Clear fields");

        JPanel to = new JPanel();
        JPanel subject = new JPanel();
        JPanel message = new JPanel();
        JPanel button = new JPanel();

        // Labels
        JLabel toLabel = new JLabel("To:");
        JLabel subjectLabel = new JLabel("Subject:");
        JLabel messageLabel = new JLabel("Message:");
        toLabel.setPreferredSize(new Dimension(55,30));
        subjectLabel.setPreferredSize(new Dimension(55,30));
        messageLabel.setPreferredSize(new Dimension(55,30));
        messageLabel.setVerticalAlignment(JLabel.TOP);

        to.add(toLabel);
        to.add(toText);
        subject.add(subjectLabel);
        subject.add(subjectText);
        message.add(messageLabel);
        message.add(messageTextScroll);
        button.add(send);
        button.add(clear);

        // Positioning components
        jFrame.add(to);
        jFrame.add(subject);
        jFrame.add(message);
        jFrame.add(button);
        jFrame.pack();

        send.addActionListener(actionEvent -> messageText.append("\nMail has been sent!"));
        clear.addActionListener(actionEvent ->{
            messageText.setText("");
            toText.setText("");
            subjectText.setText("");
        });
    }

    public static void main(String[] args) {
        new JEMail2();
    }
}
