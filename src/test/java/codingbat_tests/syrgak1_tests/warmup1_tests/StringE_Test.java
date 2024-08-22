package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.StringE;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringE_Test {
    StringE stringE_t = new StringE();

    @DataProvider(name = "StringE")
    public Object[][] dpStringE(){
        return new Object[][]{
                {"Hello", true},
                {"Heelle", true},
                {"Heelele", false}
        };
    }

    @Test(description = "Verify StringE Function", dataProvider = "StringE")
    public void stringETest(String str, boolean exp){
        Assert.assertEquals(stringE_t.stringE(str), exp);
    }
}
