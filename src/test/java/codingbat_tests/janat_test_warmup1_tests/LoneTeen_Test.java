package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.LoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoneTeen_Test {
    LoneTeen loneTeen = new LoneTeen();

    @DataProvider(name = "lone_teen")
    public Object[][] dpLoneTeen(){
        return new Object[][]{
                {13, 99, true},
                {21, 19, true},
                {13, 13, false},
                {14, 20, true},
                {20, 15, true},
        };
    }

    @Test(description = "Verify Lone_Teen Function", dataProvider = "lone_teen")
    public void loneTeenTest(int a, int b, boolean exp){
        Assert.assertEquals(loneTeen.loneTeen(a, b), exp);
    }
}
