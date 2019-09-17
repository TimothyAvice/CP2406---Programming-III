package week8.DebugEleven;

public class DebugOceanLiner extends DebugBoat
{
   DebugOceanLiner()
   {
      super("ocean liner");
      setPassengers();
      setPower();
   }

   public void setPassengers()
   {
      super.passengers = 2400;
   }

   public void setPower()
   {
      super.power = "four engines";
   }
}
