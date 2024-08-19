package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.StringBits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringBits_Test {
    StringBits stringBits = new StringBits();

    @DataProvider(name = "stringBits")
    public Object[][] dpStringBits(){
        return new Object[][]{
                {"Hello","Hlo"},
                {"", ""},
                {"pi", "p"},
                {"Chocoate","Coot"},
                {"Heeololeo","Hello"},
        };
    }

    @Test(description = "Verify StringBits function",dataProvider = "stringBits")
    public void stringBitsTest(String s ,String exp){
        Assert.assertEquals(stringBits.stringBits(s),exp);
    }
}
