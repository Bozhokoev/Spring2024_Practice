package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.StringE;
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
                {"Heelele", false},
                {"Hll", false},
                {"e", true},
        };
    }

    @Test(description = "Verify String_E Function", dataProvider = "string_e")
    public void stringETest(String str, boolean exp){
        Assert.assertEquals(stringE.stringE(str), exp);
    }

}
