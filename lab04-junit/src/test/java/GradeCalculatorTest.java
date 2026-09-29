import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {
    @Test
    @DisplayName("90 оноо яг A дүн байх ёстой (хязгаарын тохиолдол)")

    void ninetyIsExactlyA()
    {
        GradeCalculator calc = new GradeCalculator();      // Arrange
        String grade = calc.letterGrade(90.0);             // Act
        assertEquals("A", grade);                          // Assert
    }

}
