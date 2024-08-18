package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.StartOz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartOz_Test {
    StartOz startOz = new StartOz();

    @DataProvider(name = "start_oz")
    public Object[][] dpStartOz(){
        return new Object[][]{
                {"ozymandias", "oz"},
                {"bzoo", "z"},
                {"o", "o"},
                {"", ""},
                {"zoo", ""},
                {"zzzz", "z"}
        };
    }

    @Test(description = "Verify startOz function", dataProvider = "start_oz")
    public void startOzTest(String str, String expected){
        Assert.assertEquals(startOz.startOz(str), expected);
    }
}
