package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.LoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoneTeen_Test {
    LoneTeen loneTeen_t = new LoneTeen();

    @DataProvider(name = "LoneTeen")
    public Object[][] dpLoneTeen(){
        return new Object[][]{
                {13, 99, true},
                {14, 20, true},
                {13, 13, false}
        };
    }

    @Test(description = "Verify LoneTeen Function", dataProvider = "LoneTeen")
    public void loneTeenTest(int num, int num2, boolean exp){
        Assert.assertEquals(loneTeen_t.loneTeen(num, num2), exp);
    }
}
