package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {
    Makes10 makes10_t = new Makes10();

    @DataProvider(name = "Makes10")
    public Object[][] dpMakes10(){
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {8, 3, false}
        };
    }

    @Test(description = "Verify Makes10 Function", dataProvider = "Makes10")
    public void makes10Test(int num, int num2, boolean exp){
        Assert.assertEquals(makes10_t.makes10(num, num2), exp);
    }
}
