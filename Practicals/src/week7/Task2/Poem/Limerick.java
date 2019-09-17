package week7.Task2.Poem;

public class Limerick extends Poem {
    private int lines = 5;

    Limerick(String name) {
        super(name);
    }

    @Override
    public int getLines() {
        return lines;
    }
}
