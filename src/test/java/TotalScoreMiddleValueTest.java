import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TotalScoreMiddleValueTest {
    @Test
    void sumsRepresentativeMiddleComponentValues() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(5, 20, 5, 5, 15);

        // Assert
        assertEquals(50, total);
    }

    @Test
    void sumsMixedValuesCorrectly() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(8, 27, 6, 9, 24);

        // Assert
        assertEquals(74, total);
    }
}