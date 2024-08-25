package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.Max1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max1020_Test {

    Max1020 max1020 = new Max1020();

    @DataProvider(name = "max1020")
    public Object[][] dpMax1020() {
        return new Object[][]{
                {11, 19, 19},
                {11, 9, 11},
                {9, 21, 0},
                {21, 10, 10},
                {23, 10, 10},
                {20, 10, 20},
                {7, 20, 20},
                {17, 16, 17}
        };
    }

    @Test(description = "Verify Max1020 Functional", dataProvider = "max1020")
    public void max1020_test(int a, int b, int res) {
        Assert.assertEquals(max1020.max1020(a, b), res);
    }
}
