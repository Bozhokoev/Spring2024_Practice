package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Close10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Close10_Test {
    Close10 close10_t = new Close10();

    @DataProvider(name = "Close10")
    public Object[][] dpClose10(){
        return new Object[][]{
                {8,13,8},
                {13,8,8},
                {13,7,0}
        };
    }

    @Test(description = "Verify Close10 Function", dataProvider = "Close10")
    public void close10Test(int a, int b, int exp){
        Assert.assertEquals(close10_t.close10(a, b), exp);
    }
}
