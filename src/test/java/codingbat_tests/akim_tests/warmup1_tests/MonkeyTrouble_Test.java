package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.MonkeyTrouble;
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
                {false, true, false}
        };
    }
    @Test(description = "Verify monkey function", dataProvider = "monkey_trouble")
    public void monkeyTrouble(boolean aSmile, boolean bSmile, boolean expected){
        Assert.assertEquals(monkeyTrouble.monkeyTrouble(aSmile, bSmile), expected);
    }
}
