package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.jyldyzbek.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals; // Use Assert from TestNG

public class SumDoubleTest {

    @DataProvider(name = "SumDoubleData")
    public Object[][] sumDoubleData() {
        return new Object[][]{
                {1, 3, 4},   // 1 + 3 = 4
                {2, 3, 5},   // 2 + 3 = 5
                {5, 5, 20}    // 2 * (2 + 2) = 8
        };
    }

    @Test(dataProvider = "SumDoubleData")
    public void testSumDouble(int a, int b, int expected) {
        SumDouble sumDouble = new SumDouble();
        int result = sumDouble.sumDouble(a, b);
        Assert.assertEquals(result, expected, "Ошибка для входных данных: " + a + " и " + b);
    }
}
