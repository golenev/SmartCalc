import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorTest {

    @DataProvider
    public static Object[][] testingSumDataPositive() {
        return new Object[][]{
                {4, 2, 2},
                {100, 50, 50},
                {100, 99, 1}
        };
    }

    @Test(dataProvider = "testingSumDataPositive")
    public void testingSumDataPositive(int expectedValue, int one, int two) {
        Assert.assertEquals(expectedValue, Calculator.calc(one, two, '+'));
    }

    @DataProvider
    public static Object[][] testingSumDataNegative() {
        return new Object[][]{
                {5, 2, 2},
                {101, 50, 50},
                {99, 99, 0}
        };
    }

    @Test(dataProvider = "testingSumDataNegative")
    public void testingSumDataNegative(int expectedValue, int one, int two) {
        Assert.assertNotEquals(expectedValue, Calculator.calc(one, two, '+'));
    }

    @DataProvider
    public static Object[][] testingSubNegative() {
        return new Object[][]{
                {5, 10, 5},
                {101, 202, 101},
                {99, 100, 2}
        };
    }

    @Test(dataProvider = "testingSubNegative")
    public void subNegative(int expectedValue, int one, int two) {
        Assert.assertNotEquals(expectedValue, Calculator.calc(one, two, '-'));
    }

    @DataProvider
    public static Object[][] testingSubPositive() {
        return new Object[][]{
                {5, 15, 10},
                {6, 16, 10},
                {99, 100, 1}
        };
    }

    @Test(dataProvider = "testingSubPositive")
    public void subPositive(int expectedValue, int one, int two) {
        Assert.assertEquals(expectedValue, Calculator.calc(one, two, '-'));
    }

    @DataProvider
    public static Object[][] testingMultPositive() {
        return new Object[][]{
                {10, 2, 5},
                {6, 2, 3},
                {99, 3, 33}
        };
    }

    @Test(dataProvider = "testingMultPositive")
    public void multPositive(int expectedValue, int one, int two) {
        Assert.assertEquals(expectedValue, Calculator.calc(one, two, '*'));
    }

    @DataProvider
    public static Object[][] testingMultNegative() {
        return new Object[][]{
                {11, 2, 5},
                {61, 2, 3},
                {919, 3, 33}
        };
    }

    @Test(dataProvider = "testingMultNegative")
    public void multNegative(int expectedValue, int one, int two) {
        Assert.assertNotEquals(expectedValue, Calculator.calc(one, two, '*'));
    }

    @DataProvider
    public static Object[][] testingDivNegative() {
        return new Object[][]{
                {11, 2, 5},
                {61, 2, 3},
                {919, 3, 33}
        };
    }

    @Test(dataProvider = "testingDivNegative")
    public void divNegative(int expectedValue, int one, int two) {
        Assert.assertNotEquals(expectedValue, Calculator.calc(one, two, '/'));
    }

    @DataProvider
    public static Object[][] testingDivPositive() {
        return new Object[][]{
                {11, 22, 2},
                {60, 120, 2},
                {1, 678, 678}
        };
    }

    @Test(dataProvider = "testingDivPositive")
    public void divPositive(int expectedValue, int one, int two) {
        Assert.assertEquals(expectedValue, Calculator.calc(one, two, '/'));
    }
}





