import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    @Test
    @DisplayName("Негативный тест. Деление на ноль")
    void divisionByZero() {
        double inf = Double.POSITIVE_INFINITY;
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Calculator.calc(3, 0, '/'));
    }

    @Test
    @DisplayName("Позитивный тест. Деление")
    void calculatorTestWhenDivizionPozitiv() {
        Assertions.assertEquals(50, Calculator.calc(100, 2, '/'));
    }

    @Test
    @DisplayName("Позитивный тест. Умножение")
    void calculatorTestWhenMultiplicationPozitiv() {
        Assertions.assertEquals(999, Calculator.calc(33, 33, '*'));
    }

    /*@Test
    @DisplayName("Негативный тест. Умножение")
    void calculatorTestWhenMultiplicationNegative() {
        Assertions.assertThrowsExactly()
    }*/
}
