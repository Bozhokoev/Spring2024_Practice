package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Max1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max1020_Test {
    Max1020  max1020 = new Max1020();

    @DataProvider(name = "max1020")
    public Object[][] dpMax1020(){
        return new Object[][]{
                {11, 19,19},
                {11, 9,11},
                {9, 21, 0},
                {10, 21, 10},
                {7, 20,20},
                {20, 10,20},
        };
    }

    @Test(description = "Verify Max1020 function", dataProvider = "max1020")
    public void max1020Test(int a, int b, int exp){
        Assert.assertEquals(max1020.max1020(a,b),exp);
    }
}
