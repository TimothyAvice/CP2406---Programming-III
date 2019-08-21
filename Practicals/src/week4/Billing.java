package week4;

public class Billing {

    public double computeBill(double price){
        double tax = price*0.08;
        return price+tax;
    }

    public double computeBill(double price, int numBooks){
        double cost = price*numBooks;
        double tax = cost*0.08;
        return cost+tax;
    }

    public double computeBill(double price, int numBooks, double coupon){
        double cost = (price*numBooks)-coupon;
        double tax = cost*0.08;
        return cost+tax;
    }
}
