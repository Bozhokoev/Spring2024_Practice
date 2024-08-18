package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.StartOz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartOzTest {

    @DataProvider(name = "startOzDataProvider")
    public Object[][] startOzDataProvider() {
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

    @Test(dataProvider = "startOzDataProvider")
    public void testStartOz(String input, String expected) {
        StartOz startOz = new StartOz();
        Assert.assertEquals(
                startOz.startOz(input),
                expected);
    }
}
