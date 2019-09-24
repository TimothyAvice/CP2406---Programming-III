package week8.Task2.Newspaper;

public class OnlineNewspaperSubscription extends NewspaperSubscription{

    @Override
    public void setAddress(String address) {
        boolean at = false;
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '@') {
                at = true;
                break;
            }
        }
        if (at){
            rate = 9;
            this.address = address;
        }
        else {
            rate = 0;
            System.out.println("Error invalid address");
        }
    }
}
