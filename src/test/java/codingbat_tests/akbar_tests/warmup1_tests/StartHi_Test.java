package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHi_Test {
    StartHi startHi = new StartHi();

    @DataProvider(name = "startHi")
    public Object[][] dpStartHi() {
        return new Object[][]{
                {"hi there", true},
                {"hi", true},
                {"hi ho", true},
                {"", false},
                {"h", false},
        };
    }
    @Test(description = "Verify StartHi function", dataProvider = "startHi")
    public void startHiTest(String s, boolean exp){
        Assert.assertEquals(startHi.startHi(s),exp);
    }
}
