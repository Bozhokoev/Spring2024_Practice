package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.StartOz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartOz_Test {

    StartOz startOz = new StartOz();

    @DataProvider(name = "startOz")
    public Object[][] dpStartOz() {
        return new Object[][]{
                {"ozymandias", "oz"},
                {"bzoo", "z"},
                {"oxx", "o"},
                {"oz", "oz"},
                {"ounce", "o"},
                {"o", "o"},
                {"abc", ""},
                {"", ""},
                {"zoo", ""},
                {"aztec", "z"},
                {"zzzz", "z"},
                {"oznic", "oz"}
        };
    }

    @Test(description = "Verify Start Oz Functional", dataProvider = "startOz")
    public void startOz_test(String str, String res) {
        Assert.assertEquals(startOz.startOz(str), res);
    }
}
