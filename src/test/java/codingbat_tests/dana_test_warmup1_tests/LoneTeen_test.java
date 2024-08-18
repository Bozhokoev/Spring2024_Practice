package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.LoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoneTeen_test {

    LoneTeen loneTeen = new LoneTeen();

    @DataProvider(name = "loneTeen")
    public Object[][] dpLoneTeen(){
        return new Object[][]{
                {13, 99, true},
                {13, 13, false},
                {20, 15, true},
                {16, 18, false},
                {6, 18, true},
                {99, 99, false}
        };
    }
    @Test(description = "Verify Lone Teen Functional", dataProvider = "loneTeen")
    public void loneTeen_test(int a, int b, boolean res){
        Assert.assertEquals(loneTeen.loneTeen(a, b), res);
    }
}
