package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.Last2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last2_Test {
    Last2 last2 = new Last2();

    @DataProvider(name = "last2")
    public Object[][] dpLast2(){
        return new Object[][]{
                {"hixxhi",1},
                {"xaxxaxaxx", 1},
                {"xxaxxaxxaxx",3},
                {"h",0},
                {"",0},
        };
    }

    @Test(description = "Verify Last2 function",dataProvider = "last2")
    public void last2Test(String s, int exp){
        Assert.assertEquals(last2.last2(s),exp);
    }
}
