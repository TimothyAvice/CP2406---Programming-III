package week8.Task2.PhoneCall;

public abstract class PhoneCall {
    String phoneNumber;
    double callPrice;

    PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.callPrice = 0.0;
    }


    public void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }

    public abstract String getPhoneNumber();

    public abstract double getCallPrice();
    public abstract String display();
}
