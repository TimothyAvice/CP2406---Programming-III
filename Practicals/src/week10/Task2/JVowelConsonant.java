package week10.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JVowelConsonant implements ActionListener {
    private String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
            "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private String[] vowels = {"A", "E", "I", "O", "U"};
    private JButton[] letters = new JButton[8];
    private Random random = new Random();
    private JLabel label = new JLabel();

    private JVowelConsonant() {
        // Framework
        JFrame jFrame = new JFrame("Vowel Consonant");
        jFrame.setLayout(new GridLayout(2,1));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        // Panels
        JPanel top = new JPanel(new GridLayout(0,2));
        JPanel labelContainer = new JPanel();
        JPanel topLeft = new JPanel(new GridLayout(0,2));
        JPanel topRight = new JPanel(new GridLayout(0,2));

        for(int i = 0; i < letters.length; i++){
            letters[i] = new JButton();
            letters[i].setText(alphabet[random.nextInt(26)]);
            for(int j = 0; j < letters.length; j++){
                while (j != i && letters[j] != null && letters[i].getText().equals(letters[j].getText())){
                    letters[i].setText(alphabet[random.nextInt(26)]);
                }
            }
            if(i<4) {
                topLeft.add(letters[i]);
                letters[i].addActionListener(this);
            }
            else {
                topRight.add(letters[i]);
                letters[i].addActionListener(this);
            }
        }

        labelContainer.add(label);
        top.add(topLeft);
        top.add(topRight);
        jFrame.add(top);
        jFrame.add(labelContainer);
        jFrame.pack();


    }

    public static void main(String[] args) {
        new JVowelConsonant();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        for (int i = 0; i < letters.length; i++) {
            if (source == letters[i]) {
                boolean isVowel = false;
                for (String vowel : vowels) {
                    if (letters[i].getText().equals(vowel)) {
                        isVowel = true;
                    }
                }
                if(isVowel){
                    label.setText(letters[i].getText() + " is a vowel");
                }
                else {
                    label.setText(letters[i].getText() + " is a consonant");
                }
                letters[i].setText(alphabet[random.nextInt(26)]);
                for(int j = 0; j < letters.length; j++){
                    while (j != i && letters[j] != null && letters[i].getText().equals(letters[j].getText())){
                        letters[i].setText(alphabet[random.nextInt(26)]);
                    }
                }
            }
        }
    }
}
