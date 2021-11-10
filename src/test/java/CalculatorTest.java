import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class CalculatorTest {
    @Test
    @DisplayName("Позитивный тест. Сложение")
    void calculatorTestWhenAddictionPositive() {
        Assertions.assertEquals(100, Calculator.calc(50.0, 50.0, '+'));
    }

    @Test
    @DisplayName("Негативный тест . Сложение")
    void calculatorTestWhenAddictionNegative() {
        Assertions.assertNotEquals(101, Calculator.calc(50.0, 50.0, '+'));
    }

    @Test
    @DisplayName("Позитивный тест. Вычитание")
    void calculatorTestWhenSubtractionPositive() {
        Assertions.assertEquals(0, Calculator.calc(50.0, 50.0, '-'));
    }

    @Test
    @DisplayName("Негативный тест. Вычитание")
    void calculatorTestWhenSubtractionNegative() {
        Assertions.assertNotEquals(101, Calculator.calc(50.0, 50.0, '-'));
    }

    @Test
    @DisplayName("Позитивный тест. Умножение")
    void calculatorTestWhenMultiplicationPositive() {
        Assertions.assertEquals(2500, Calculator.calc(50.0, 50.0, '*'));
    }

    @Test
    @DisplayName("Негативный тест. Умножение")
    void calculatorTestWhenMultiplicationNegative() {
        Assertions.assertNotEquals(101, Calculator.calc(50.0, 50.0, '*'));

    }
    @Test
    @DisplayName("Позитивный тест. Деление")
    void calculatorTestWhenDivizionPositive() {
        Assertions.assertEquals(1, Calculator.calc(50.0, 50.0, '/'));
    }

    @Test
    @DisplayName("Негативный тест. Деление на ноль")
    void divisionByZero() {
        double inf = Double.POSITIVE_INFINITY;
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Calculator.calc(3, 0, '/'));
    }

    @DataProvider
    public Object [][] testingData (){
      return new Object[][]{
              {5, Calculator.calc(2.0,3.0,'+')},
              {5, Calculator.calc(4.0,1.0,'+')},
              {5, Calculator.calc(0.0,5.0,'+')}
      }  ;
    }

    @Test (dataProvider = "testingData")
    public void testDataProviderAddiction (double result, double num){
        Assert.assertEquals(5.0,5.0, "всё верно");

    }

}





