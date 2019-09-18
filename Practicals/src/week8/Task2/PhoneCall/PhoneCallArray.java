package week8.Task2.PhoneCall;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneArray = new PhoneCall[10];
        String[] numbers = {"919198", "3231354", "74523", "1258456", "987412",
                "984564", "815895", "479585", "15991852", "7896552"};
        boolean Incoming = false;
        for (int i = 0; i < phoneArray.length; i++){
            if (Incoming){
                phoneArray[i] = new IncomingPhoneCall(numbers[i]);
                Incoming = false;
            }
            else {
                phoneArray[i] = new OutgoingPhoneCall(numbers[i], i+122);
                Incoming = true;
            }
            System.out.println(phoneArray[i].display());
        }
    }
}
