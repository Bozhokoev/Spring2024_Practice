package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStart_Test {
    MixStart mixStart = new MixStart();

    @DataProvider (name = "Mix Start")
    public Object [][] dpMixStart(){
        return new Object[][]{
                {"Mix snacks",true},
                {"piz snacks",false},
                {"nix",true},
                {"",false},
        };
    }
    @Test (description = "Verify Mix Snacks Test", dataProvider = "Mix Start")
    public void mixSnacksTest(String str,boolean exp){
        Assert.assertEquals(mixStart.mixStart(str),exp);
    }
}
