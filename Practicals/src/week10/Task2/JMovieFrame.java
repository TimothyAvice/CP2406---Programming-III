package week10.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame implements ActionListener {
    private JButton[] buttons = new JButton[5];
    private String[] buttText = {"North", "East", "South", "West", "Centre"};
    private JLabel label = new JLabel("Hey");

    private JMovieFrame() {
        // Framework
        JFrame jFrame = new JFrame("Movie Frame");
        jFrame.setLayout(new GridLayout(2,1));
        JPanel movies = new JPanel(new BorderLayout());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        for(int i=0; i<buttons.length; i++){
            buttons[i] = new JButton(buttText[i]);
            switch (i){
                case 0:
                    movies.add(buttons[i], BorderLayout.NORTH);
                    break;
                case 1:
                    movies.add(buttons[i], BorderLayout.EAST);
                    break;
                case 2:
                    movies.add(buttons[i], BorderLayout.SOUTH);
                    break;
                case 3:
                    movies.add(buttons[i], BorderLayout.WEST);
                    break;
                default:
                    movies.add(buttons[i], BorderLayout.CENTER);
                    break;
            }
            buttons[i].addActionListener(this);
        }
        jFrame.add(movies);
        jFrame.add(label);
        label.setHorizontalAlignment(JLabel.CENTER);
        jFrame.pack();
    }

    public static void main(String[] args) {
        new JMovieFrame();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == buttons[0]){
            label.setText("Northenstien | Year: 1931");
        } else if(source == buttons[1]){
            label.setText("East to Terabithia | Year: 2007");
        } else if(source == buttons[2]){
            label.setText("South out of Compton | Year: 2015");
        } else if(source == buttons[3]){
            label.setText("Wild Wild West | Year: 1999");
        } else if(source == buttons[4]){
            label.setText("Journey to the centre of the earth | Year 2008");
        }
    }
}
