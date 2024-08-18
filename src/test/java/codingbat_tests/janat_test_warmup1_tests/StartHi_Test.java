package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.StartHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartHi_Test {

    StartHi startHi = new StartHi();

    @DataProvider(name = "start_hi")
    public Object[][]dpStartHi(){
        return new Object[][]{
                {"hi there", true},
                {"hi", true},
                {"hello hi", false},
                {"he", false},
                {"h", false},
        };
    }

    @Test(description = "Verify Start_Hi Function", dataProvider = "start_hi")
    public void startHiTest(String str, boolean exp){
        Assert.assertEquals(startHi.startHi(str), exp);
    }
}
