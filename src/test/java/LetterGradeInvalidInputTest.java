import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterGradeInvalidInputTest {
    @Test
    @DisplayName("letterGrade - Сөрөг утгад exception гаргах")
    void rejectsScoreBelowZero() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.letterGrade(-1));
    }

    @Test
    @DisplayName("letterGrade - Давсан утгад exception хийх")
    void rejectsScoreAboveOneHundred() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.letterGrade(101));
    }
}