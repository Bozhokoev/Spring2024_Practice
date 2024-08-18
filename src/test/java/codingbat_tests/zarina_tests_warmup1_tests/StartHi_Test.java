package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHi_Test {
    StartHi startHi = new StartHi();

    @DataProvider(name = "StartHi")
    public Object[][] dpStartHi() {
        return new Object[][]{
                {"hi there", true},
                {"h", false},
                {"", false},
                {"hi ho", true},
        };
    }

    @Test(description = "Verify StartHi Test", dataProvider = "StartHi")
    public void startHiTest(String str, boolean exp) {
        Assert.assertEquals(startHi.startHi(str), exp);
    }
}
