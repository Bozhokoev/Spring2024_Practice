package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.StringE;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringE_Test {

    StringE stringE = new StringE();

    @DataProvider(name = "stringE")
    public Object[][] dpStringE(){
        return new Object[][]{
                {"Hello", true},
                {"Heelle", true},
                {"Heelele", false	},
                {"Hll", false},
                {"e", true},
                {"", false},
        };
    }

    @Test(description = "Verify StringE Functional", dataProvider = "stringE")
    public void stringE(String str, boolean res){
        Assert.assertEquals(stringE.stringE(str), res);
    }
}
