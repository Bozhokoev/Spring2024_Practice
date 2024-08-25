package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTrouble_Test {
    MonkeyTrouble monkeyTrouble_t = new MonkeyTrouble();

    @DataProvider(name = "MonkeyTrouble")
    public Object[][] dpMonkeyTrouble(){
        return new Object[][]{
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}
        };
    }

    @Test(description = "Verify MonkeyTrouble Function", dataProvider = "MonkeyTrouble")
    public void monkeyTroubleTest(boolean a, boolean b, boolean exp){
        Assert.assertEquals(monkeyTrouble_t.monkeyTrouble(a, b), exp);
    }
}
