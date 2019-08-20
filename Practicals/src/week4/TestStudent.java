package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStudent {

    @Test
    void basicTest(){
        Student student = new Student();
        student.setCreditHours(12.01);
        assertEquals(student.getCreditHours(), 12.01);

        student.setPoints(25);
        assertEquals(student.getPoints(), 25);

        student.setStudentID(1);
        assertEquals(student.getStudentID(), 1);
    }

    @Test
    void checkGPA(){
        Student student = new Student();
        student.setPoints(25);
        student.setCreditHours(5);
        assertEquals(student.gpa(), 25/5);
    }

    @Test
    void initialiser(){
        Student student = new Student();
        assertEquals(student.getStudentID(), 9999);
        assertEquals(student.getPoints(), 12);
        assertEquals(student.getCreditHours(), 3);
        assertEquals(student.gpa(), 4.0);
    }
}