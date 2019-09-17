package week7.Task2.SugarSmash;

import java.util.ArrayList;

public class SugarSmashPlayer {
    private int id;
    private int levels = 10;
    private String name;
    private ArrayList<Integer> highestScores = new ArrayList<>();
    private boolean premium;

    SugarSmashPlayer(int id, String name, ArrayList<Integer> highestScore) {
        this.id = id;
        this.name = name;
        this.highestScores = highestScore;
    }

    SugarSmashPlayer(int id, String name) {
        this.id = id;
        this.name = name;
        for (int i = 0; i < levels; i++)
            highestScores.add(0);
    }

    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void getHighestScore(int level) {
        level--;
        if (level >= highestScores.size()) {
            System.out.println("Invalid level");
        } else {
            System.out.format("Score: %s, Level %d\n", highestScores.get(level), level + 1);
        }
    }

    ArrayList<Integer> getHighestScores() {
        return highestScores;
    }

    void setHighestScore(int level, int score) {
        level--;
        if (level < 0 || level > highestScores.size()) {
            System.out.println("Invalid level");
        } else {
            if (premium || level == 0) {
                highestScores.set(level, score);
                System.out.format("Score: %s, Level %d\n", score, level + 1);
            } else {
                for (int i = 0; i < highestScores.size(); i++) {
                    if (i == level) {
                        highestScores.set(level, score);
                        System.out.format("Score: %s, Level %d\n", score, level + 1);
                        break;
                    } else {
                        if (highestScores.get(i) < 100) {
                            System.out.format("Score on level %d is below the required amount to pass (100)!\n", i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }


    int getLevels() {
        return levels;
    }

    void setLevels(int levels) {
        this.levels = levels;
    }

    void setPremium(boolean premium) {
        this.premium = premium;
    }
}
