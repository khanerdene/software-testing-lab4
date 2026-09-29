import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TotalScoreComponentBoundaryTest {
    @Test
    void acceptsEachComponentAtItsMaximum() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double[] results = new double[5];

        results[0] = calculator.totalScore(10, 0, 0, 0, 0);
        results[1] = calculator.totalScore(0, 40, 0, 0, 0);
        results[2] = calculator.totalScore(0, 0, 10, 0, 0);
        results[3] = calculator.totalScore(0, 0, 0, 10, 0);
        results[4] = calculator.totalScore(0, 0, 0, 0, 30);

        // Assert
        assertEquals(10, results[0]);
        assertEquals(40, results[1]);
        assertEquals(10, results[2]);
        assertEquals(10, results[3]);
        assertEquals(30, results[4]);
    }

    @Test
    void acceptsEachComponentAtZero() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertEquals(0, calculator.totalScore(0, 0, 0, 0, 0));
    }
}