package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.StringE;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringE_Test {
    StringE stringE = new StringE();

    @DataProvider(name = "stringE")
    public Object[][] dpStringE(){
        return new Object[][]{
                {"Hello",true},
                {"",false},
                {"Hll", false},
                {"e",true},
        };
    }

    @Test(description = "Verify StringE",dataProvider = "stringE")
    public void stringETest(String s, boolean exp){
        Assert.assertEquals(stringE.stringE(s),exp);
    }
}
