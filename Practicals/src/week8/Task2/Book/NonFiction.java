package week8.Task2.Book;

public class NonFiction extends Book {

    NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 37.99;
    }
}
