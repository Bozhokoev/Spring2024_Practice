package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2_test {

    WithouEnd2 withouEnd2 = new WithouEnd2();

    @DataProvider(name = "withouEnd2")
    public Object[][] dpWithouEnd2(){
        return new Object[][]{
                {"Hello", "ell"},
                {"abc", "b"},
                {"ab", ""},
                {"a", ""},
                {"", ""},
                {"coldy", "old"},
                {"java code", "ava cod"}
        };
    }

    @Test(description = "Verify WithouEnd2 Functional", dataProvider = "withouEnd2")
    public void withouEnd2_test(String str, String res){
        Assert.assertEquals(withouEnd2.withouEnd2(str), res);
    }
}
