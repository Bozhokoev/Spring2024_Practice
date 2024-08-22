package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUp_Test {
    EndUp endUp_t = new EndUp();

    @DataProvider(name = "EndUp")
    public Object[][] dpEndUp(){
        return new Object[][]{
                {"Hello", "HeLLO"},
                {"hi there", "hi thERE"},
                {"hi", "HI"}
        };
    }

    @Test(description = "Verify EndUp Function", dataProvider = "EndUp")
    public void endUpTest(String a, String exp){
        Assert.assertEquals(endUp_t.endUp(a), exp);
    }
}
