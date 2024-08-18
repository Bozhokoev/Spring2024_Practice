package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.StringE;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringE_Test {
    StringE stringE = new StringE();

    @DataProvider(name = "string_e")
    public Object[][] dpStringE(){
        return new Object[][]{
                {"Hello", true},
                {"Heelle", true},
                {"Hll", false},
                {"e", true},
                {"", false},
        };
    }

    @Test(description = "Verify stringE function", dataProvider = "string_e")
    public void stringETest(String str, boolean expected){
        Assert.assertEquals(stringE.stringE(str), expected);
    }
}
