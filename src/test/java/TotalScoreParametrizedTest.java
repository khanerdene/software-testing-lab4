import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TotalScoreParametrizedTest {
    @ParameterizedTest
    @DisplayName("totalScore - олон төрлийн энгийн утгууд шалгах параметрт тест")
    @CsvSource({
        "0, 0, 0, 0, 0, 0",
        "10, 40, 10, 10, 30, 100",
        "5, 20, 5, 5, 15, 50",
        "8, 27, 6, 9, 24, 74",
        "10, 0, 0, 0, 0, 10",
        "0, 40, 0, 0, 0, 40",
        "0, 0, 10, 0, 0, 10",
        "0, 0, 0, 10, 0, 10",
        "0, 0, 0, 0, 30, 30"
    })
    void calculatesTotalForValidScores(double att, double lab, double quiz1, double quiz2, double exam, double expectedTotal)
    {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act
        double total = calculator.totalScore(att, lab, quiz1, quiz2, exam);

        // Assert
        assertEquals(expectedTotal, total);
    }

    @ParameterizedTest
    @DisplayName("totalScore - олон төрлийн буруу утгууд exception шалгах параметрт тест")
    @CsvSource({
        "-1, 0, 0, 0, 0",
        "0, -1, 0, 0, 0",
        "0, 0, -1, 0, 0",
        "0, 0, 0, -1, 0",
        "0, 0, 0, 0, -1",
        "11, 0, 0, 0, 0",
        "0, 41, 0, 0, 0",
        "0, 0, 11, 0, 0",
        "0, 0, 0, 11, 0",
        "0, 0, 0, 0, 31"
    })
    void rejectsScoresOutsideComponentLimits(double att, double lab, double quiz1, double quiz2,
            double exam) {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        // Act and Assert
        assertThrows(IllegalArgumentException.class,
                () -> calculator.totalScore(att, lab, quiz1, quiz2, exam));
    }
}