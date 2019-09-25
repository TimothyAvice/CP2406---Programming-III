package week9.DebugFourteen;
// Displays list of payment options - credit card, check or cash
// Displays fee for using each - 5%, 2% or 0%

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen2 extends JFrame implements ItemListener
{
   private FlowLayout flow = new FlowLayout();
   private JComboBox<String> payMethod = new JComboBox<String>();
   private JLabel payList = new JLabel("Pay List");
   private JTextField totFees = new JTextField(25);
   private String pctMsg = "per cent will be added to your bill";
   private int[] fees = {5, 2, 0};
   private int feePct = 0;
   private String output;
   int fee = 0;

   private DebugFourteen2()
   {
      super("Pay List");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      payMethod.addItemListener(this);
      add(payList);
      add(payMethod);
      payMethod.addItem("Credit card");
      payMethod.addItem("Check");
      payMethod.addItem("Cash");
      add(totFees);
   }
   public static void main(String[] arguments)
   {
      JFrame cframe = new DebugFourteen2();
      cframe.setSize(350,150);
      cframe.setVisible(true);
   }

   @Override
   public void itemStateChanged(ItemEvent itemEvent)
   {
      Object source = itemEvent.getSource();
      if(source == payMethod)
      {
         int fee = payMethod.getSelectedIndex();
         feePct = fees[fee];
         output = feePct + " " + pctMsg;
         totFees.setText(output);
      }
   }
}