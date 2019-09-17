package week7.Task2.Course;

class CollegeCourse {
    private int courseFee;
    private String department;
    private int courseNum;
    private int creditHours;

    CollegeCourse(String department, int courseNum, int creditHours) {
        this.department = department;
        this.courseNum = courseNum;
        this.creditHours = creditHours;
        this.courseFee = 120 * creditHours;
    }

    void Display() {
        System.out.format("Department: %s\nCourse Number: %d\nCredit Hours: %d\nCourse Fee: $%d\n\n",
                department, courseNum, creditHours, courseFee);
    }

    void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }
}
