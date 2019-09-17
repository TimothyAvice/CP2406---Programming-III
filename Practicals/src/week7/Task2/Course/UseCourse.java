package week7.Task2.Course;

import javax.swing.*;
import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        String[] labCourse = {"BIO", "CHM", "CIS", "PHY"};
        String courseDept;
        CollegeCourse collegeCourse;
        int courseNum;
        int creditHours;
        boolean isLabCourse = false;

        courseDept = JOptionPane.showInputDialog(null,
                "Enter the department");
        courseNum = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number"));
        creditHours = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the credit hours"));
        for (String s : labCourse) {
            if (courseDept.equals(s)) {
                isLabCourse = true;
                break;
            }
        }
        if (isLabCourse) {
            collegeCourse = new LabCourse(courseDept, courseNum, creditHours);
        } else {
            collegeCourse = new CollegeCourse(courseDept, courseNum, creditHours);
        }
        collegeCourse.Display();
    }
}
