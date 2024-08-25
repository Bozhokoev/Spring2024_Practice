package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStart_Test {

    MixStart mixStart = new MixStart();

    @DataProvider(name = "mix_start")
    public Object[][] dpMixStart(){
        return new Object[][]{
                {"mix snacks", true},
                {"pix snacks", true},
                {"piz snacks", false},
                {"nix", true},
                {"ni", false},
        };
    }

    @Test(description = "Verify Mix_Start Function", dataProvider = "mix_start")
    public void mixStartTest(String str, boolean exp){
        Assert.assertEquals(mixStart.mixStart(str), exp);
    }
}
