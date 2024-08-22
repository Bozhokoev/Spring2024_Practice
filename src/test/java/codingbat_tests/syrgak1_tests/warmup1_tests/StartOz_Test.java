package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.StartOz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartOz_Test {
    StartOz startOz_t = new StartOz();

    @DataProvider(name = "StartOz")
    public Object[][] dpStartOz(){
        return new Object[][]{
                {"ozymandias", "oz"},
                {"bzoo", "z"},
                {"ounce", "o"},
                {"", ""},
        };
    }

    @Test(description = "Verify StartOz Function", dataProvider = "StartOz")
    public void startOzTest(String str, String exp){
        Assert.assertEquals(startOz_t.startOz(str), exp);
    }
}
