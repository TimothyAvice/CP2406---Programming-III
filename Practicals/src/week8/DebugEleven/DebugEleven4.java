package week8.DebugEleven;
// Creates and displays an array of boats -
// some are rowboats; some are ocean liners
import javax.swing.*;
public class DebugEleven4
{
   private static DebugBoat[] boatArray = new DebugBoat[5];
   public static void main(String[] args) 
   {
      buildArray();
      displayArray();
   }
   private static void buildArray()
   {
     //declare x as int in for loop
     char boatType;
     for(int x = 0; x < boatArray.length; ++x)
     {
        boatType = getBoat();
        if(boatType =='r')
 	     boatArray[x] = new DebugRowboat();
        else
          boatArray[x] = new DebugOceanLiner();
     }
   }
   private static char getBoat()
   {
      String boatType;
      boatType = JOptionPane.showInputDialog(null, 
         "Enter r for rowboat; o for ocean liner ");
      return boatType.charAt(0);
   }
   private static void displayArray()
   {
      for(int x = 0; x < boatArray.length; ++x)
      JOptionPane.showMessageDialog(null, "Boat #" + (x  + 1) +
         boatArray[x].toString());
   }
}
