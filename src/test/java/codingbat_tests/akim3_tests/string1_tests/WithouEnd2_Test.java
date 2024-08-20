package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2_Test {
    WithouEnd2 withouEnd2 = new WithouEnd2();

    @DataProvider(name = "withou_end_2")
    public Object[][] dpWithouEnd2(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java code", "ava cod"},
                {"ab", ""},
                {"abc", "b"}
        };
    }

    @Test(description = "Verify withouEnd2 function", dataProvider = "withou_end_2")
    public void withouEnd2Test(String str, String expected){
        Assert.assertEquals(withouEnd2.withouEnd2(str), expected);
    }
}
