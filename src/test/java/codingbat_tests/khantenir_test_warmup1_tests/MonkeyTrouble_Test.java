package codingbat_tests.khantenir_test_warmup1_tests;

import codingbat.khantenir.warmup1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MonkeyTrouble_Test {
    @DataProvider(name = "MonkeyTroubleData")
    public Object [][] dataMonkeyTrouble(){
        return new Object[][] {
                {true, true, true},
                {false, false, true},
                {true, false, false}
        };
    }
    @Test(dataProvider = "MonkeyTroubleData")
    public void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean accepted){
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean result = monkeyTrouble.monkeyTrouble(aSmile, bSmile);
        assertEquals(result, accepted);
    }
}
