package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.StartOz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartOz_Test {

    StartOz startOz = new StartOz();

    @DataProvider (name = "Start Oz")
    public Object [][] dpStartOz(){
        return new Object[][]{
                {"ozymandias","oz"},
                {"oxx","o"},
                {"zzzz","z"},
        };
    }

    @Test(description = "Verify Start Oz Test", dataProvider = "Start Oz")
    public void startOzTest (String str, String exp){
        Assert.assertEquals(startOz.startOz(str),exp);
    }
}
