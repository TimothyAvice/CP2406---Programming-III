package week8.Task2.PhoneCall;

public class OutgoingPhoneCall extends PhoneCall {
    private int callTime;

    OutgoingPhoneCall(String phoneNumber, int callTime) {
        super(phoneNumber);
        super.callPrice = 0.04;
        this.callTime = callTime;
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
        return "Number: " + phoneNumber + ",Rate: $" + callPrice + ",Call Time: " + callTime + ",Total: $" + calcTotal();
    }

    private double calcTotal(){
        return callPrice * callTime;
    }
}
