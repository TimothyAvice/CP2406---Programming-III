package week7.Task2.Course;

class LabCourse extends CollegeCourse {

    LabCourse(String department, int courseNum, int creditHours) {
        super(department, courseNum, creditHours);
        int labFee = 50;
        setCourseFee(labFee + creditHours * 120);
    }

    @Override
    void Display() {
        System.out.println("Lab Course:");
        super.Display();
    }
}
