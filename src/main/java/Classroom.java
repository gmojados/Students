import java.util.*;

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
    public Student[] getStudentsByScore(){
        int counter =0;
        for (Student student :  students){
            if (student == null){
                counter++;
            }
        }
        Student[] workList = Arrays.copyOf(students, students.length-counter);
       Student[] studentsSorted = new Student[students.length-counter];
       Student currentHighest = null; //
       for (int classRank = 0; classRank < studentsSorted.length; classRank++){
           int currentIndex = 0;
           for (int j = 0; j < studentsSorted.length; j++){
               Student currentStudent = workList[j];
               if (currentStudent != null){
                   if (currentStudent.getAverageExamScore()>
                           (currentHighest != null?currentHighest.getAverageExamScore():0)){
                       currentHighest = currentStudent;
                       currentIndex = j;
                   }
               }
           } if (currentHighest != null){
               studentsSorted[classRank] = currentHighest;
               workList[currentIndex] = null;
               currentHighest = null;
           }
       }
        return studentsSorted;
    }

    public Map<Student, String> getGradeBook() {
        Map<Student, String> studentGrades = new HashMap<>();
        Student[] studentsSorted = getStudentsByScore();
        int students = studentsSorted.length;


        for (int i = 0; i < students; i++){
            double studentPercentile =
                     (double) (100 * (studentsSorted.length - i)) /(studentsSorted.length);
            String letterGrade;

            if(studentPercentile >= 90){
                letterGrade = "A";
            } else if (studentPercentile >= 71) {
                letterGrade = "B";
            } else if (studentPercentile >=50) {
                letterGrade = "C";
            } else if (studentPercentile >=11) {
                letterGrade =  "D";
            }else {
                letterGrade = "F";
            }
            studentGrades.put(studentsSorted[i],letterGrade);
        }
        return studentGrades;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

}