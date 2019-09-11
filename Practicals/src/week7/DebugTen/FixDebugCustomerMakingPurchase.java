package week7.DebugTen;

public class FixDebugCustomerMakingPurchase extends FixDebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    FixDebugCustomerMakingPurchase(int id,
                                   String name, double credit, double purchAmount)
    {
        super(id, name, credit);
        amountOfPurchase = purchAmount;
        overLimit = amountOfPurchase > creditLimit;
    }

    public FixDebugCustomerMakingPurchase(int id, String name, double credit) {
        super(id, name, credit);
    }

    @Override
    public void display()
    {
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
