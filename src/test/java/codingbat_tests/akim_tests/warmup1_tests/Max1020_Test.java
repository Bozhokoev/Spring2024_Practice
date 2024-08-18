package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Max1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max1020_Test {
    Max1020 max1020 = new Max1020();

    @DataProvider(name = "max_1020")
    public Object[][] dpMax1020(){
        return new Object[][]{
                {11, 19, 19},
                {9, 21, 0},
                {21, 10, 10},
                {20, 10, 20},
                {17, 16, 17}
        };
    }

    @Test(description = "Verify Max1020 function", dataProvider = "max_1020")
    public void max1020Test(int a, int b, int expected){
        Assert.assertEquals(max1020.max1020(a, b), expected);
    }
}
