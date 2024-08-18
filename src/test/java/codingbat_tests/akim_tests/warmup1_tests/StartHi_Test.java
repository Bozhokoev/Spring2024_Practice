package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHi_Test {
    StartHi startHi = new StartHi();

    @DataProvider(name = "start_hi")
    public Object[][] dpStartHi(){
        return new Object[][]{
                {"hi there", true},
                {"hi", true},
                {"hello hi", false},
                {"he", false},
                {"h", false},
                {"", false}
        };
    }

    @Test(description = "Verify start_hi function", dataProvider = "start_hi")
    public void startHiTest(String str, boolean expected){
        Assert.assertEquals(startHi.startHi(str), expected);
    }
}
