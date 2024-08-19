package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.StringX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringX_Test {
    StringX stringX = new StringX();

    @DataProvider(name = "string_x")
    public Object[][] dpStringX(){
        return new Object[][]{
                {"xxHxix", "xHix"},
                {"abxxxcd", "abcd"},
                {"xabxxxcdx", "xabcdx"},
                {"xx", "xx"},
                {"", ""}
        };
    }

    @Test(description = "Verify stringX function", dataProvider = "string_x")
    public void stringXTest(String str, String expected){
        Assert.assertEquals(stringX.stringX(str), expected);
    }
}
