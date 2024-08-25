package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {

    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "SumDouble")
    public Object[][] dpSumDouble() {
        return new Object[][]{
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
        };
    }

    @Test(description = "Verify SumDouble Function", dataProvider = "SumDouble")
    public void setSumDoubleTest(int a, int b, int expected) {
        Assert.assertEquals(sumDouble.sumDouble(a, b), expected);
    }
}
