package codingbat_tests.janybek_test_warmup1_tests;


import codingbat.janybek.warmup1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class MonkeyTroubleTest {
    @DataProvider(name = "monkeyTroubleData")
    public Object[][] createData() {
        return new Object[][]{
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false},
        };
    }


    @Test(dataProvider = "monkeyTroubleData")
    public void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean result = monkeyTrouble.monkeyTrouble(aSmile, bSmile);
        System.out.println("Running test with aSmile: " + aSmile + ", bSmile: " + bSmile + " -> Expected: " + expected + ", Result: " + result);
        assertEquals(result, expected);
    }
}