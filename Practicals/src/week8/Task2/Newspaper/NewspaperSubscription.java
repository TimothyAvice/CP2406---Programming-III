package week8.Task2.Newspaper;

public abstract class NewspaperSubscription {
    private String name;
    String address;
    double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    double getRate() {
        return rate;
    }

    public abstract void setAddress(String address);
}
