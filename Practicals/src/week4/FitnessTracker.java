package week4;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private String date;

    public FitnessTracker(){
        activity = "running";
        minutes = 0;
        date = "01/01/2019";
    }

    public FitnessTracker(String activity, int minutes, String date){
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
