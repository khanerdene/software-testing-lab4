import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TotalScoreMiddleValueTest {
    @Test
    @DisplayName("totalScore - Дундын утгад гаралт зөв байх (яг дундаж)")
    void sumsRepresentativeMiddleComponentValues() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(5, 20, 5, 5, 15);

        // Assert
        assertEquals(50, total);
    }

    @Test
    @DisplayName("totalScore - Дундын утгад гаралт зөв байх (хэлбэлзэлтэй)")
    void sumsMixedValuesCorrectly() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(8, 27, 6, 9, 24);

        // Assert
        assertEquals(74, total);
    }
}