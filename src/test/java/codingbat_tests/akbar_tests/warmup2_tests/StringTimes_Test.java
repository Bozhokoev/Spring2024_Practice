package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.StringTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTimes_Test {

    StringTimes stringTimes = new StringTimes();

    @DataProvider(name = "stringTimes")
    public Object[][] dpStringTimes() {
        return new Object[][]{
                {"Hi", 2,"HiHi"},
                {"Hi", 3, "HiHiHi"},
                {"Hi", 0, ""},
                {"x", 4, "xxxx"},
                {"",  4,""},
        };
    }

    @Test(description = "Verify StringTimes function", dataProvider = "stringTimes")
    public void stringTimesTest(String s, int n, String exp){
        Assert.assertEquals(stringTimes.stringTimes(s,n),exp);
    }
}
