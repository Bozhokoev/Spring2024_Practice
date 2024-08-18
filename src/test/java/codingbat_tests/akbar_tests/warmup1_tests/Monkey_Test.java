package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Monkey_Test {
    MonkeyTrouble monkeyTest = new MonkeyTrouble();

    @DataProvider(name = "Monkey smile")
    public Object[][] IsMonkeySmile() {
        return new Object[][]{
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}
        };
    }

    @Test(description = "Verify is Smile", dataProvider = "Monkey smile")
    public void SmileMonkey(boolean a, boolean b, boolean exp) {
        Assert.assertEquals(monkeyTest.monkeyTrouble(a, b), exp);
    }
}
