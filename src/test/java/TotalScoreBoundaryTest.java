import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TotalScoreBoundaryTest {
    @Test
    @DisplayName("totalScore - Доод хязгаарын утгуудад гаралт зөв байх")
    void sumsAllMinimumComponentValues() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(0, 0, 0, 0, 0);

        // Assert
        assertEquals(0, total);
    }

    @Test
    @DisplayName("totalScore - Дээд хязгаарын утгуудад гаралт зөв байх")
    void sumsAllMaximumComponentValues() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(10, 40, 10, 10, 30);

        // Assert
        assertEquals(100, total);
    }
}