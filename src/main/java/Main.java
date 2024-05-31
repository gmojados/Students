import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double[] examScores1 = {78.0,89.0,94.0};
        Double[] examScores2 = {73.0,82.0,90.0};
        Double[] examScores3 = {90.0,79.0,95.0};
        Student student1 = new Student("Marco", "Polo",examScores1);
        Student student2 = new Student("John", "Wick", examScores2);
        Student student3 = new Student("Mary","Lamb",examScores3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);

        //System.out.println(Arrays.toString(classroom.getStudentsByScore()));

        System.out.println(classroom.getGradeBook());










    }
}
