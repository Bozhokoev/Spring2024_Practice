package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2_Test {
    WithouEnd2 withouEnd2 = new WithouEnd2();

    @DataProvider(name = "withou_end_2")
    public Object[][] dpWithouEnd2(){
        return new Object[][]{
                {"Hello", "ell"},
                {"abc", "b"},
                {"ab", ""},
                {"a", ""},
                {"", ""},
        };
    }
    @Test(description = "Verify Withou_End2 Function", dataProvider = "withou_end_2")
    public void withouEndTest(String str, String exp){
        Assert.assertEquals(withouEnd2.withouEnd2(str), exp);
    }
}
