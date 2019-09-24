package week8.Task2.Newspaper;

public class DemoNewspaperSubscription {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription();
        physical.setName("George");
        OnlineNewspaperSubscription online = new OnlineNewspaperSubscription();
        online.setName("John");

        // Test setAddress on physical
        physical.setAddress("Cairns");
        physical.setAddress("22 Street");
        online.setAddress("Not");
        online.setAddress("Not@not.com");

        System.out.format("Physical Newspaper Subscription. Name: %s, Address: %s, Rate: $%.2f\n",
                physical.getName(),physical.getAddress(), physical.getRate());

        System.out.format("Online Newspaper Subscription. Name: %s, Address: %s, Rate: $%.2f\n",
                online.getName(),online.getAddress(), online.getRate());
    }
}
