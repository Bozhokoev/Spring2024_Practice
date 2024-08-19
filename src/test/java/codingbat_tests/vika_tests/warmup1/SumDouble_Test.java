package codingbat_tests.vika_tests.warmup1;

import codingbat.vika.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "sum_double")
    public Object[][] dpSumDouble() {
        return new Object[][] {
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
        };
    }

    @Test(description = "Verify Sum Double Function", dataProvider = "sum_double")
    public void setSumDoubleTest (int a, int b, int exp) {
        Assert.assertEquals(sumDouble.sumDouble(a, b), exp);
    }
}
