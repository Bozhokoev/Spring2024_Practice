package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUp_Test {
    EndUp endUp = new EndUp();

    @DataProvider(name = "end_up")
    public Object[][] dpEndUp(){
        return new Object[][]{
                {"Hello", "HeLLO"},
                {"woo hoo", "woo HOO"},
                {"hi", "HI"},
                {"xyz12", "xyZ12"},
                {"", ""}
        };
    }

    @Test(description = "Verify end_up function", dataProvider = "end_up")
    public void endUpTest(String str, String expected){
        Assert.assertEquals(endUp.endUp(str), expected);
    }
}
