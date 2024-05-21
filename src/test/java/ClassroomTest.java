import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    private Classroom classroom;


    @BeforeEach
    public void setUP(){
        //given
        Double[] examScores1 = {78.0,89.0,94.0};
        Double[] examScores2 = {73.0,82.0,90.0};
        Double[] examScores3 = {90.0,79.0,95.0};
       Student student1 = new Student("Marco", "Polo",examScores1);
       Student student2 = new Student("John", "Wick", examScores2);
       Student student3 = new Student("Mary","Lamb",examScores3);
       Student[] students = {student1,student2,student3};
       classroom = new Classroom(students);



    }

    @Test
    void testGetAverageExamScore() {
        //when
        double actualAverage = classroom.getAverageExamScore();
        //then
        double expectedAverage = ((90.0 + 85.0 + 78.0) / 3 + (88.0 + 92.0 + 76.0) / 3) / 2;
        Assertions.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    //@Test
   // void addStudent() {

   // }
}