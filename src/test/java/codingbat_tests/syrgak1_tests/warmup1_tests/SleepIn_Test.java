package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepIn_Test {
    SleepIn sleepIn_test = new SleepIn();

    @DataProvider(name = "SleepIn")
    public Object[][] dpSleepIn(){
        return new Object[][]{
                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true}
        };
    }

    @Test(description = "Veryfing SleepIn Function", dataProvider = "SleepIn")
    public void sleepInTest(boolean a, boolean b, boolean exp){
        Assert.assertEquals(sleepIn_test.sleepIn(a, b), exp);
    }
}
