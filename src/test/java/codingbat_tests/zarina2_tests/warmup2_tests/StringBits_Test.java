package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.StringBits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringBits_Test {
    StringBits stringBits = new StringBits();

    @DataProvider (name = "String Bits")
public Object [][] dpStringBits(){
        return new Object[][]{
                {"Hello", "Hlo"},
                {"", ""},
                {"pi", "p"},
        };
    }

    @Test(description = "Verify String Bts function",dataProvider = "String Bits")
    public void stringBitsTest(String str, String res){
        Assert.assertEquals(stringBits.stringBits(str),res);
    }
}
