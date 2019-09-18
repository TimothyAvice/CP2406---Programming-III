package week8.Task2.PhoneCall;

public class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        super.callPrice = 0.02;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getCallPrice() {
        return callPrice;
    }

    @Override
    public String display() {
        return "Number: " + phoneNumber + ",Rate: $" + callPrice + ",Call Price: $" + callPrice;
    }
}
