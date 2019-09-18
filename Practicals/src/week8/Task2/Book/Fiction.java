package week8.Task2.Book;

public class Fiction extends Book {

    Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }
}
