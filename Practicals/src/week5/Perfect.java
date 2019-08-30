package week5;

public class Perfect {
    public static void main(String[] args) {
        int currentNum = 0;
        int factorSum = 0;
        for (int i = 0; i < 1000; i++) {
            currentNum++;
            for (int j = 1; j < currentNum; j++) {
                if (currentNum % j == 0)
                    factorSum += j;
            }
            if (factorSum == currentNum)
                System.out.println(currentNum + " Is a perfect number");
            factorSum = 0;
        }
    }
}
