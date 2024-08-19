package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.Last2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last2_test {

    Last2 last2 = new Last2();

    @DataProvider(name = "last2")
    public Object[][] dpLast2(){
        return new Object[][]{
                {"hixxhi", 1},
                {"xaxxaxaxx", 1},
                {"axxxaaxx", 2},
                {"xxaxxaxxaxx", 3},
                {"xaxaxaxx", 0},
                {"xxxx", 2},
                {"13121312", 1},
                {"11212", 1},
                {"13121311", 0},
                {"1717171", 2},
                {"hi", 0},
                {"h", 0},
                {"", 0}
        };
    }
    @Test(description = "Verify Last2 Functional", dataProvider = "last2")
    public void last2_test(String str, int res){
        Assert.assertEquals(last2.last2(str), res);
    }
}
