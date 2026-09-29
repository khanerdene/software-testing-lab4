import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LetterGradeBoundaryTest {
    @Test
    void returnsExpectedGradeAtEachThreshold() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        String[] results = new String[5];

        results[0] = calculator.letterGrade(0);
        results[2] = calculator.letterGrade(70);
        results[3] = calculator.letterGrade(80);
        results[4] = calculator.letterGrade(90);
        results[5] = calculator.letterGrade(100);

        // Assert
        assertEquals("F", results[0]);
        assertEquals("D", results[1]);
        assertEquals("C", results[2]);
        assertEquals("B", results[3]);
        assertEquals("A", results[4]);
        assertEquals("A", results[5]);
    }
}