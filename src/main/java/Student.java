import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }
    public ArrayList<Double> getExamScores() {
        System.out.println("Exam Scores for "+ getFirstName() + ": " +  "\n " + examScores);
        return examScores;
    }


    public void addExamScore(double examScore){
        examScores.add(examScore);
    }
    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public double setExamScores(int examScoreIndexPos, double newScore) {
        this.examScores = examScores;
        getExamScores().set(examScoreIndexPos,newScore);
        return newScore;
    }
    public double getAverageExamScore (){
    int totalExams = getNumberOfExamsTaken();
    double scores = 0;
    for(double num : examScores){
        scores += num;
    }
    double avg = scores/totalExams;
        return avg;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }
}
