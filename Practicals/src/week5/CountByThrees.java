package week5;

public class CountByThrees {
    public static void main(String[] args) {
        for(int i = 3; i <= 300; i += 3){
            System.out.print(i + " ");
            if (i%30 == 0){
                System.out.print("\n");
            }
        }
    }
}
