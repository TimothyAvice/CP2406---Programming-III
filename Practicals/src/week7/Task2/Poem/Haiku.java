package week7.Task2.Poem;

public class Haiku extends Poem {
    private int lines = 3;

    Haiku(String name) {
        super(name);
    }

    @Override
    public int getLines() {
        return lines;
    }
}
