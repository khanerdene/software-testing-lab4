import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TotalScoreInvalidInputTest {
    @Test
    @DisplayName("totalScore - Параметр болгонд сөрөг утгад exception гаргах")
    void rejectsNegativeValueForEveryComponent() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(-1, 0, 0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, -1, 0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 0, -1, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 0, 0, -1, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 0, 0, 0, -1));
    }

    @Test
    @DisplayName("totalScore - Параметр болгоны давсан утгад exception гаргах")
    void rejectsValueAboveMaximumForEveryComponent() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(11, 0, 0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 41, 0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 0, 11, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 0, 0, 11, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.totalScore(0, 0, 0, 0, 31));
    }
}