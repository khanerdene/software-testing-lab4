import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterGradeMiddleValueTest {
    @Test
    @DisplayName("letterGrade - Дундийн утгуудад гаралт зөв байх")
    void returnsExpectedGradesForMiddleValues() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();
        String[] results = new String[5];

        // Act

        results[0] = calculator.letterGrade(30);
        results[1] = calculator.letterGrade(65);
        results[2] = calculator.letterGrade(75);
        results[3] = calculator.letterGrade(85);
        results[4] = calculator.letterGrade(95);

        // Assert
        assertEquals("F", results[0]);
        assertEquals("D", results[1]);
        assertEquals("C", results[2]);
        assertEquals("B", results[3]);
        assertEquals("A", results[4]);
    }
}