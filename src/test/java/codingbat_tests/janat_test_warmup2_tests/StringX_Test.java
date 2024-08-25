package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.StringX;
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
                {"xKittenx", "xKittenx"},
                {"Hello", "Hello"},
        };
    }
    @Test(description = "Verify String_X Function", dataProvider = "string_x")
    public void stringXTest(String str, String exp){
        Assert.assertEquals(stringX.stringX(str), exp);
    }
}
