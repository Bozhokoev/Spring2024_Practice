package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.StringX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringX_test {

    StringX stringX = new StringX();

    @DataProvider(name = "stringX")
    public Object[][] dpStringX(){
        return new Object[][]{
                {"xxHxix", "xHix"},
                {"abxxxcd", "abcd"},
                {"xabxxxcdx", "xabcdx"},
                {"xKittenx", "xKittenx"},
                {"Hello", "Hello"},
                {"xx", "xx"},
                {"x", "x"},
                {"", ""}
        };
    }

    @Test(description = "Verify StringX Functional", dataProvider = "stringX")
    public void stringX_test(String str1, String res){
        Assert.assertEquals(stringX.stringX(str1), res);
    }
}
