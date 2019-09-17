package week7.Task2.Poem;

public class DemoPoems {
    public static void main(String[] args) {
        Haiku haiku = new Haiku("Haiku");
        Couplet couplet = new Couplet("Couplet");
        Limerick limerick = new Limerick("Limerick");
        System.out.println("Name: " + haiku.getName() + "\nLines: " + haiku.getLines());
        System.out.println("Name: " + couplet.getName() + "\nLines: " + couplet.getLines());
        System.out.println("Name: " + limerick.getName() + "\nLines: " + limerick.getLines());
    }
}
