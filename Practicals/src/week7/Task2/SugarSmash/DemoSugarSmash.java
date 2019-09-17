package week7.Task2.SugarSmash;

public class DemoSugarSmash {
    public static void main(String[] args) {
        SugarSmashPlayer sugarSmashPlayer = new SugarSmashPlayer(39, "Test");

        //Tests get and set highest score
        sugarSmashPlayer.getHighestScore(11);
        sugarSmashPlayer.setHighestScore(2, 100);
        sugarSmashPlayer.setHighestScore(1, 100);
        sugarSmashPlayer.setHighestScore(2, 100);
        for (int i = 1; i < sugarSmashPlayer.getHighestScores().size() + 1; i++) {
            //Set all levels as 100 (Complete all levels)
            sugarSmashPlayer.setHighestScore(i, 100);
        }

        //Tests set level
        sugarSmashPlayer.setLevels(sugarSmashPlayer.getLevels() + 1);
        sugarSmashPlayer.getHighestScores().add(0);
        sugarSmashPlayer.getHighestScore(11);

        //Test premium user
        sugarSmashPlayer = new PremiumSugarSmashPlayer(sugarSmashPlayer.getId(),
                sugarSmashPlayer.getName(), sugarSmashPlayer.getHighestScores());
        sugarSmashPlayer.setHighestScore(50, 10);

        //Test out of range case
        sugarSmashPlayer.setHighestScore(100, 10);
    }
}
