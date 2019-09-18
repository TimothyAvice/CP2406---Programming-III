package week8.Task2.PhoneCall;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("0219486342");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("4765165165", 142);

        System.out.println(incomingPhoneCall.display());
        System.out.println(outgoingPhoneCall.display());
    }
}
