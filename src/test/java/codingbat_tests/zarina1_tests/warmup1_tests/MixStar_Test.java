package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStar_Test {

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
