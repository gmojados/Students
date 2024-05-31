import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    Student student1 ;
    Student student2;
    Student student3;
    Classroom classroom;

    @BeforeEach
    public void setUP(){
        //given
        Double[] examScores1 = {78.0,89.0,94.0};
        Double[] examScores2 = {73.0,82.0,90.0};
        Double[] examScores3 = {90.0,79.0,95.0};
       student1 = new Student("Marco", "Polo",examScores1);
       student2 = new Student("John", "Wick", examScores2);
       student3 = new Student("Mary","Lamb",examScores3);
       Student[] students = {student1,student2,student3};
       classroom = new Classroom(students);

    }

    @Test
    void testGetAverageExamScore() {
        //when
        double actualAverage = classroom.getAverageExamScore();
        //then
        double expectedAverage = (student1.getAverageExamScore() + student2.getAverageExamScore() +
                student3.getAverageExamScore())/ 3;
        Assertions.assertEquals(expectedAverage, actualAverage, 0.0001);
    }
    @Test
    void getStudentByScore (){
        //when
        Student[] actualOutput = classroom.getStudentsByScore();

        //then
        assertEquals("Mary", actualOutput[0].getFirstName());
        assertEquals("Marco", actualOutput[1].getFirstName());
        assertEquals("John", actualOutput[2].getFirstName());
    }
    @Test
    void getGradeBook(){
        //when
        Map<Student,String> actual = classroom.getGradeBook();
        //given
        assertEquals("C",actual.getOrDefault(student1, null));
        assertEquals("D",actual.getOrDefault(student2,null));
        assertEquals("A",actual.getOrDefault(student3, null));

    }

//    @Test
//    void addStudent() {
//
//
//    }
}