package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.StartOz;
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
                {"oxx", "o"},
                {"oz", "oz"},
                {"ounce", "o"},
        };
    }

    @Test(description = "Verify Start_Oz Function", dataProvider = "start_oz")
    public void startOzTest(String str, String exp){
        Assert.assertEquals(startOz.startOz(str), exp);
    }
}
