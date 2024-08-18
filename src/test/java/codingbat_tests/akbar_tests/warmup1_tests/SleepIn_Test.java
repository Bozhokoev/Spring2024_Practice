package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SleepIn_Test {
    SleepIn sleepIn = new SleepIn();

    @DataProvider(name = "SleepIn True")
    public Object[][] dpsleepInTrue() {
        return new Object[][]{
                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true}
        };
    }

    @Test(description = "Verify SleepInTest", dataProvider = "SleepIn True")
    public void testSleepIn(boolean a, boolean b, boolean exp) {
        Assert.assertEquals(sleepIn.sleepIn(a, b), exp);
    }

}

