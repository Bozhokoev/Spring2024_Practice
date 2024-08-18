package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "sum_double")
    public Object[][] dpSumDouble(){
        return new Object[][]{
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
        };
    }

    @Test(description = "Verify sum double function", dataProvider = "sum_double")
    public void sumDouble(int a, int b, int expected){
        Assert.assertEquals(sumDouble.sumDouble(a, b), expected);
    }
}
