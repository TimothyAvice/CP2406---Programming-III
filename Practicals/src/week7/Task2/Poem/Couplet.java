package week7.Task2.Poem;

public class Couplet extends Poem {
    private int lines = 2;

    Couplet(String name) {
        super(name);
    }

    @Override
    public int getLines() {
        return lines;
    }
}
