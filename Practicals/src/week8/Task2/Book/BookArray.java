package week8.Task2.Book;

public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        String[] titles = {"Marry", "Poppins", "LMAO", "Cheese", "Quartz rod",
        "Gecko", "Red", "Ooooo", "O", "Energy"};
        boolean fiction = false;
        for (int i = 0; i < bookArray.length; i++){
            if (fiction){
                bookArray[i] = new Fiction(titles[i]);
                fiction = false;
            }
            else {
                bookArray[i] = new NonFiction(titles[i]);
                fiction = true;
            }
            System.out.println(bookArray[i]);
        }
    }
}
