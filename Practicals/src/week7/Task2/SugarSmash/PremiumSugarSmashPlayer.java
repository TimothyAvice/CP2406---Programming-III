package week7.Task2.SugarSmash;

import java.util.ArrayList;

class PremiumSugarSmashPlayer extends SugarSmashPlayer {

    PremiumSugarSmashPlayer(int id, String name, ArrayList<Integer> highestScore) {
        super(id, name, highestScore);
        setLevels(getLevels() + 40);
        setPremium(true);
        for (int i = 0; i < 40; i++)
            highestScore.add(0);
    }
}
