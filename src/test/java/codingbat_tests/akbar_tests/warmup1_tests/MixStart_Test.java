package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStart_Test {
    MixStart mixStart = new MixStart();

    @DataProvider(name = "mixStart")
    public Object[][] dpmixStart(){
        return new Object[][]{
                {"mix snacks",true},
                {"pix snacks",true},
                {"piz snacks", false},
                {"",false},
        };
    }

    @Test(description = "Verify MixStart function", dataProvider = "mixStart")
    public void mixStartTest(String s, boolean exp){
        Assert.assertEquals(mixStart.mixStart(s),exp);
    }
}
