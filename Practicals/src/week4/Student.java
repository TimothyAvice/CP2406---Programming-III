package week4;

public class Student {
    private int studentID;
    private double creditHours;
    private int points;

    public Student(){
        studentID = 9999;
        points = 12;
        creditHours = 3;
    }

    public double gpa() {
        return points/creditHours;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public int getPoints() {
        return points;
    }

    public void setStudentID(int ID) {
        studentID = ID;
    }

    public void setCreditHours(double hours) {
        creditHours = hours;
    }

    public void setPoints(int numberPoints) {
        points = numberPoints;
    }
}
