package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTrouble_Test {
    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @DataProvider(name = "monkey_trouble")
    public Object[][] dpMonkeyTrouble(){
        return new Object[][]{
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false},
        };
    }

    @Test(description = "Verify Monkey_Trouble Function", dataProvider = "monkey_trouble")
    public void monkeyTroubleTest(boolean a, boolean b, boolean exp){
        Assert.assertEquals(monkeyTrouble.monkeyTrouble(a, b), exp);
    }
}
