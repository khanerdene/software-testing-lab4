import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterGradeFractionalValueTest {
    @Test
    @DisplayName("letterGrade - Хязгаарын утгуудаас бага хэмжээгээр зөрөхөд хариу зөв байх")
    void assignsGradesForFractionalScoresNearThresholds() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();
        String[] results = new String[5];

        //Act

        results[0] = calculator.letterGrade(59.99);
        results[1] = calculator.letterGrade(69.99);
        results[2] = calculator.letterGrade(79.99);
        results[3] = calculator.letterGrade(89.99);
        results[4] = calculator.letterGrade(99.99);

        //Assert
        assertEquals("F", results[0]);
        assertEquals("D", results[1]);
        assertEquals("C", results[2]);
        assertEquals("B", results[3]);
        assertEquals("A", results[4]);
    }
}