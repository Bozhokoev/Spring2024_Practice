package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUp_test {

    EndUp endUp = new EndUp();

    @DataProvider(name = "endUp")
    public Object[][] dpEndUp(){
        return new Object[][]{
                {"Hello", "HeLLO"},
                {"hi there", "hi thERE"},
                {"hi", "HI"},
                {"woo hoo", "woo HOO"},
                {"xyz12", "xyZ12"},
                {"x", "X"},
                {"", ""}
        };
    }

    @Test(description = "Verify EndUp Functiomal", dataProvider = "endUp")
    public void endUp_test(String str, String res){
        Assert.assertEquals(endUp.endUp(str), res);
    }
}
