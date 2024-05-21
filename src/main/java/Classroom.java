import java.util.ArrayList;
import java.util.List;

public class Classroom {
    Student[] students;

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore (){
        double avgScore = 0;
        int totalStudents =0;

        for (Student student : students){
            if (student != null) {
                avgScore +=  student.getAverageExamScore();
                totalStudents++;
            }
        }

        return avgScore/totalStudents;
    }
    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                students[i] = null;
            }
        }
    }
    public void getStudentsByScore(){
        List<Student> allStudents = new ArrayList<>();
    }


}