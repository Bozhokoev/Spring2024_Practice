package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndUp_Test {

    EndUp endUp = new EndUp();

    @DataProvider (name = "EndUp")
    public Object [][] dpEndUp(){
        return new Object[][]{
                {"Hello", "HeLLO"},
                {"", ""},
                {"Woo Hoo", "Woo HOO"},
        };
    }

    @Test(description = "Verify EndUp Test", dataProvider = "EndUp")
    public void endUpTest (String str, String res){
        Assert.assertEquals(endUp.endUp(str),res);
    }
}
