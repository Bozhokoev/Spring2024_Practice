package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.StringBits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringBits_test {

    StringBits stringBits = new StringBits();

    @DataProvider(name = "stringBits")
    public Object[][] dpStringBits(){
        return new Object[][]{
                {"Hello", "Hlo"},
                {"Hi", "H"},
                {"Heeololeo", "Hello"},
                {"HiHiHi", "HHH"},
                {"", ""},
                {"Greetings", "Getns"},
                {"Chocoate", "Coot"},
                {"pi", "p"},
                {"Hello Kitten", "HloKte"},
                {"hxaxpxpxy", "happy"}
        };
    }

    @Test(description = "Verify String Bits Functional", dataProvider = "stringBits")
    public void stringBits_test(String str, String res){
        Assert.assertEquals(stringBits.stringBits(str), res);
    }
}
