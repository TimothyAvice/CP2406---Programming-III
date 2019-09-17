package week7.Task2.Poem;

public class Poem {
    private String name;
    private int lines;

    Poem(String name, int lines) {
        this.name = name;
        this.lines = lines;
    }

    Poem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }
}
