package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.Last2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last2_Test {
    Last2 last2 = new Last2();

    @DataProvider(name = "last2")
    public Object[][] dpLast2(){
        return new Object[][]{
                {"hixxhi", 1},
                {"xxaxxaxxaxx", 3},
                {"13121312", 1},
                {"13121311", 0},
                {"h", 0}
        };
    }

    @Test(description = "Verify last2 function", dataProvider = "last2")
    public void last2Test(String str, int expected){
        Assert.assertEquals(last2.last2(str), expected);
    }
}
