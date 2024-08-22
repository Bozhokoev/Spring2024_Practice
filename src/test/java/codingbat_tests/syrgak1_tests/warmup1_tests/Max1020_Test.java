package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Max1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max1020_Test {
    Max1020 max1020_t = new Max1020();

    @DataProvider(name = "Max1020")
    public Object[][] dpMax1020(){
        return new Object[][]{
                {11,19,19},
                {19,11,19},
                {11,9,11}
        };
    }

    @Test(description = "Verify Max1020 Function", dataProvider = "Max1020")
    public void max1020Test(int a, int b, int exp){
        Assert.assertEquals(max1020_t.max1020(a, b), exp);
    }
}
