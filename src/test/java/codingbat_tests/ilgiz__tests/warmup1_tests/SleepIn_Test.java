package codingbat_tests.ilgiz__tests.warmup1_tests;

import codingbat.akim.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SleepIn_Test {
    SleepIn sleepIn = new SleepIn();

    @DataProvider(name = "sleep_in data_true")
    public Object[][] dpSleepInTrue() {
        return new Object[][]{
                {false, false},
                {false, true},
                {true, true}
        };
    }

    @DataProvider(name = "sleep_in data_false")
    public Object[][] dpSleepInFalse() {
        return new Object[][]{{true, false}};
    }

    @Test(description = "Verify sleep in function", dataProvider = "sleep_in data_true")
    public void sleepInTestTrue(boolean a, boolean b) {
        Assert.assertEquals(sleepIn.sleepIn(a, b), true);
    }

    @Test(description = "Verify sleep in function", dataProvider = "sleep_in data_false")
    public void sleepInTestFalse(boolean a, boolean b) {
        Assert.assertEquals(sleepIn.sleepIn(a, b), false);
    }
}
