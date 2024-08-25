package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.StringTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTimes_test {

    StringTimes stringTimes = new StringTimes();

    @DataProvider(name = "stringTimes")
    public Object[][] dpStringTimes(){
        return new Object[][]{
                {"Hi", 2, "HiHi"},
                {"Hi", 3, "HiHiHi"},
                {"Hi", 1, "Hi"},
                {"Hi", 0, ""},
                {"Hi", 5, "HiHiHiHiHi"},
                {"Oh Boy!", 2, "Oh Boy!Oh Boy!"},
                {"x", 4, "xxxx"},
                {"", 4, ""},
                {"code", 2, "codecode"},
                {"code", 3, "codecodecode"},
        };
    }
    @Test(description = "Verify String Times Functional", dataProvider = "stringTimes")
    public void stringTimes_rest(String str, int a, String res){
        Assert.assertEquals(stringTimes.stringTimes(str, a), res);
    }
}
