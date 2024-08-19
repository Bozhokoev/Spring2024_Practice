package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.StringTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTimes_Test {
    StringTimes stringTimes = new StringTimes();

    @DataProvider(name = "string_times")
    public Object[][] dpStringTimes(){
        return new Object[][]{
                {"Hi", 2, "HiHi"},
                {"Hi", 5, "HiHiHiHiHi"},
                {"Oh Boy!", 2, "Oh Boy!Oh Boy!"},
                {"code", 2, "codecode"},
                {"", 4, ""}
        };
    }

    @Test(description = "Verify stringTimes function", dataProvider = "string_times")
    public void stringTimesTest(String str, int index, String expected){
        Assert.assertEquals(stringTimes.stringTimes(str, index), expected);
    }
}
