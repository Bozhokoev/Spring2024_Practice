package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.StringTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTimes_Test {
    StringTimes stringTimes = new StringTimes();

    @DataProvider(name = "string_times")
    public Object[][] dpStringTimes() {
        return new Object[][] {
                {"Hi", 2, "HiHi"},
                {"Hi", 3, "HiHiHi"},
                {"x", 4, "xxxx"},
        };
    }

    @Test(description = "Verify String Times Function", dataProvider = "string_times")
    public void stringTimesTest (String str, int n, String exp) {
        Assert.assertEquals(stringTimes.stringTimes(str, n), exp);
    }
}
