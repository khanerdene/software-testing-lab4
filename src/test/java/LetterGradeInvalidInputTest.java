import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class LetterGradeInvalidInputTest {
    @Test
    void rejectsScoreBelowZero() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.letterGrade(-1));
    }

    @Test
    void rejectsScoreAboveOneHundred() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.letterGrade(101));
    }
}