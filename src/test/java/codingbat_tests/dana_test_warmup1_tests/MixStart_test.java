package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStart_test {

    MixStart mixStart = new MixStart();

    @DataProvider(name = "mixStart")
    public Object[][] dpMixStart(){
        return new Object[][]{
                {"mix snacks", true},
                {"pix snacks", true},
                {"piz snacks", false},
                {"nix", true},
                {"ni", false},
                {"n", false},
                {"", false}
        };
    }
    @Test(description = "Verify Mix Start", dataProvider = "mixStart")
    public void mixStart_test(String str, boolean res){
        Assert.assertEquals(mixStart.mixStart(str), res);
    }
}
