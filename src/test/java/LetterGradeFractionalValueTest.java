import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LetterGradeFractionalValueTest {
    @Test
    void assignsGradesForFractionalScoresNearThresholds() {
        // Arrange
        GradeCalculator calculator = new GradeCalculator();

        //Act
        String[] results = new String[5];

        results[0] = calculator.letterGrade(59.99);
        results[2] = calculator.letterGrade(69.99);
        results[3] = calculator.letterGrade(79.99);
        results[4] = calculator.letterGrade(89.99);
        results[5] = calculator.letterGrade(99.99);
        
        //Assert
        assertEquals("F", calculator.letterGrade(59.99));
        assertEquals("D", calculator.letterGrade(69.99));
        assertEquals("C", calculator.letterGrade(79.99));
        assertEquals("B", calculator.letterGrade(89.99));
        assertEquals("A", calculator.letterGrade(99.99));
    }
}