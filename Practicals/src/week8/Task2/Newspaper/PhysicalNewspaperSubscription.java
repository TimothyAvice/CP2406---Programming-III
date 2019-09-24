package week8.Task2.Newspaper;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
        int nums = 0;
        for (int i = 0; i < 4; i++){
            if (Character.isDigit(address.charAt(i))) {
                nums++;
            }
        }
        if (nums == 0){
            rate = 0;
            System.out.println("Error invalid address");
        }
        else {
            rate = 15;
            this.address = address;
        }
    }

}
