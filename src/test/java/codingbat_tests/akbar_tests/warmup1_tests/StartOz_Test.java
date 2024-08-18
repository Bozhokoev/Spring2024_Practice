package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.StartOz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartOz_Test {
    StartOz startOz = new StartOz();

    @DataProvider(name = "start0z")
    public Object[][] dpStartOz() {
        return new Object[][]{
                {"", ""},
                {"ozymandias", "oz"},
                {"bzoo", "z"},
                {"o", "o"},
                {"abc", ""},
                {"zoo", ""},
        };
    }

    @Test(description = "Verify StartOz function", dataProvider = "start0z")
    public void startOzTest(String s, String exp) {
        Assert.assertEquals(startOz.startOz(s), exp);
    }
}
