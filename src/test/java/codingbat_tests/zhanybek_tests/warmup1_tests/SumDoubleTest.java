package codingbat_tests.zhanybek_tests.warmup1_tests;

import codingbat.zhanybek.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumDoubleTest {

    @DataProvider(name = "sumDoubleData")
    public Object[][] sumDoubleData() {
        return new Object[][]{
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
                {0, 0, 0},
                {0, 1, 1},
                {3, 4, 7}
        };
    }

    @Test(dataProvider = "sumDoubleData")
    public void testSumDouble(int a, int b, int expected) {
        SumDouble sumDouble = new SumDouble();
        int result = sumDouble.sumDouble(a, b);
        System.out.println("Running test with a: " + a + ", b: " + b + " -> Expected: " + expected + ", Result: " + result);
        Assert.assertEquals(result, expected);
    }
}
