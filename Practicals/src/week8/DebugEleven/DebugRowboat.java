package week8.DebugEleven;

public class DebugRowboat extends DebugBoat
{

   DebugRowboat()
   {
      super("row");
      setPower();
      setPassengers();
   }

   public void setPassengers()
   {
      super.passengers = 2;
   }

   public void setPower()
   {
      super.power = "oars";
   }
}