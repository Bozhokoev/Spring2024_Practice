package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.LoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loneTeen_Test {
    LoneTeen loneTeen = new LoneTeen();

    @DataProvider(name = "lone_teen")
    public Object[][] dpLoneTeen(){
        return new Object[][]{
                {13, 99, true},
                {21, 19, true},
                {13, 13, false},
                {16, 17, false},
                {13, 99, true},
                {99, 99, false}
        };
    }

    @Test(description = "Verify loneTeen function", dataProvider = "lone_teen")
    public void loneTeenTest(int a, int b, boolean expected){
        Assert.assertEquals(loneTeen.loneTeen(a, b), expected);
    }
}
