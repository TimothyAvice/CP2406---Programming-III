package week8.Task2.Book;

public abstract class Book {
    private String title;
    double price;

    Book(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

    public String toString()
    {
        return("Book: " + title + ", Cost: $" + price);
    }
}
