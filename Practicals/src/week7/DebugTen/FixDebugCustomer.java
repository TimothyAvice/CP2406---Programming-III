package week7.DebugTen;

public class FixDebugCustomer
{
    private int idNumber;
    private String name;
    double creditLimit;

    FixDebugCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       creditLimit = credit;
    }

    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
