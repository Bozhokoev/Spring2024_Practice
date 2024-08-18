package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStart_Test {
    MixStart mixStart = new MixStart();

    @DataProvider(name = "mix_start")
    public Object[][] dpMixStart(){
        return new Object[][]{
                {"mix snacks", true},
                {"nix", true},
                {"n", false},
                {"", false}
        };
    }

    @Test(description = "Verify mix_start function", dataProvider = "mix_start")
    public void mixStartTest(String str, boolean expected){
        Assert.assertEquals(mixStart.mixStart(str), expected);
    }
}
