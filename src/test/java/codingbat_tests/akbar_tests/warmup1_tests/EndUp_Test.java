package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUp_Test {
    EndUp endUp = new EndUp();

    @DataProvider(name = "endUp")
    public Object[][] dpEndUp(){
        return new Object[][] {
                {"Hello", "HeLLO"},
                {"hi there","hi thERE"},
                {"hi","HI"},
                {"woo hoo", "woo HOO"},
                {"xyz12", "xyZ12"},
        };
    }

    @Test(description = "Verify EndUp function", dataProvider = "endUp")
    public void endUpTest(String s, String exp){
        Assert.assertEquals(endUp.endUp(s),exp);
    }
}
