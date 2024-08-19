package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.FrontTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontTimes_Test {
    FrontTimes frontTimes = new FrontTimes();

    @DataProvider(name = "front_times")
    public Object[][] dpFrontTimes() {
        return new Object[][] {
                {"Chocolate", 2, "ChoCho"},
                {"Abc", 3, "AbcAbcAbc"},
                {"", 4, ""},
        };
    }

    @Test(description = "Verify Front Times Function", dataProvider = "front_times")
    public void frontTimesTest (String str, int n, String exp) {
        Assert.assertEquals(frontTimes.frontTimes(str, n), exp);
    }
}
