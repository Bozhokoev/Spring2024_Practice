package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTrouble_test {
    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @DataProvider(name = "monkey_trouble")
    public Object [][] dpMonkeyTrouble(){
        return new Object[][] {
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}
        };
    }
    @Test(description = "verify Monkey Trouble function", dataProvider = "monkey_trouble")
    public void monkeyTroubleTest(boolean a, boolean b, boolean exp){
        Assert.assertEquals(monkeyTrouble.monkeyTrouble(a, b), exp);
    }

}
