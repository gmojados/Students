import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;
    private ArrayList<Double> expectedScores;

    @BeforeEach
    public void setUp() {
        // Given
        Double[] examScores = {77.0, 65.0, 98.0};
        student = new Student("Marco", "Polo", examScores);
        expectedScores= new ArrayList<>(Arrays.asList(77.0, 65.0, 98.0));
    }

    @Test
    public void testGetAverageExamScore() {
        // When
        double actualAverage = student.getAverageExamScore();

        // Then
        double expectedAverage = (77.0 + 65.0 + 98.0) / 3;
        Assertions.assertEquals(expectedAverage, actualAverage, 0.0001);
    }
}