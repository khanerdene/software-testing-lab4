import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LetterGradeMiddleValueTest {
    @Test
    void returnsExpectedGradesForMiddleValues() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        String[] results = new String[5];

        results[0] = calculator.letterGrade(30);
        results[2] = calculator.letterGrade(65);
        results[3] = calculator.letterGrade(75);
        results[4] = calculator.letterGrade(85);
        results[5] = calculator.letterGrade(95);

        // Assert
        assertEquals("F", results[0]);
        assertEquals("D", results[2]);
        assertEquals("C", results[3]);
        assertEquals("B", results[4]);
        assertEquals("A", results[5]);
    }
}