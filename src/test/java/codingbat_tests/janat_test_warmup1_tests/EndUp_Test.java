package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUp_Test {
    EndUp endUp = new EndUp();

    @DataProvider(name = "end_up")
    public Object[][] dpEndUp(){
        return new Object[][]{
                {"Hello", "HeLLO"},
                {"hi there", "hi thERE"},
                {"hi", "HI"},
                {"woo hoo", "woo HOO"},
                {"xyz12", "xyZ12"},
        };
    }

    @Test(description = "Verify End_Up Function", dataProvider = "end_up")
    public void endUpTest(String str, String exp){
        Assert.assertEquals(endUp.endUp(str), exp);
    }
}
