package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHi_Test {
    StartHi startHi_t = new StartHi();

    @DataProvider(name = "StartHi")
    public Object[][] dpStartHi(){
        return new Object[][]{
                {"hi there", true},
                {"", false},
                {"ho hi", false}
        };
    }

    @Test(description = "Verify StartHi Function", dataProvider = "StartHi")
    public void startHiTest(String a, boolean exp){
        Assert.assertEquals(startHi_t.startHi(a), exp);
    }
}
