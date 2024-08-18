package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHi_test {

    StartHi startHi = new StartHi();

    @DataProvider(name = "startHi")
    public Object[][] dpStartHi(){
        return new Object[][]{
                {"hi there", true},
                {"hi", true},
                {"hello hi", false},
                {"he", false},
                {"h", false},
                {"", false},
                {"ho hi", false},
                {"hi ho", true}
        };
    }

    @Test(description = "Verify Start Hi Functional", dataProvider = "startHi")
    public void startHi_test(String str, boolean res){
        Assert.assertEquals(startHi.startHi(str), res);
    }
}
