package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBilling {
    double price = 2;
    int numBooks = 2;
    double coupon = 5;

    @Test
    void testComputeBill1() {
        Billing billing = new Billing();
        double cost =  price+(price*0.08);
        assertEquals(billing.computeBill(price), cost);
    }

    @Test
    void testComputeBill2() {
        Billing billing = new Billing();
        double val = price*numBooks;
        double tax = val*0.08;
        double cost = val + tax;
        assertEquals(billing.computeBill(price,numBooks), cost);
    }

    @Test
    void testComputeBill3() {
        Billing billing = new Billing();
        double val = (price*numBooks) - coupon;
        double tax = val*0.08;
        double cost = val + tax;;
        assertEquals(billing.computeBill(price,numBooks, coupon), cost);
    }
}