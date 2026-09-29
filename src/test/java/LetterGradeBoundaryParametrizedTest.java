import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LetterGradeBoundaryParametrizedTest {
    @ParameterizedTest
    @CsvSource(
        {"95,A",
        "90,A",
        "89.99,B",
        "80,B",
        "70,C",
        "60,D",
        "59.99,F",
        "0,F"}
    )
    void letterGradeBoundaries(double score, String expected)
    {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        String result = calculator.letterGrade(score);

        // Assert
        assertEquals(expected, result);
    }
}