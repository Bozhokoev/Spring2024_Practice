package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStart_Test {
    MixStart mixStart_t = new MixStart();

    @DataProvider(name = "MixStart")
    public Object[][] dpMixStart(){
        return new Object[][]{
                {"mix snacks", true},
                {"pix snacks", true},
                {"piz snacks", false}
        };
    }

    @Test(description = "Verify MixStart Function", dataProvider = "MixStart")
    public void mixStartTest(String str, boolean exp){
        Assert.assertEquals(mixStart_t.mixStart(str), exp);
    }
}
