package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.StringX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringX_Test {

    StringX stringX = new StringX();

    @DataProvider(name = "StringX")
    public Object[][] dpStringX(){
        return new Object[][]{
                {"xxHxix", "xHix"},
                {"xx", "xx"},
                {"", ""},
        };
    }
    @Test(description = "Verify StringX Function", dataProvider = "StringX")
    public void stringXTest(String str,String res){
        Assert.assertEquals(stringX.stringX(str),res);
    }
}
