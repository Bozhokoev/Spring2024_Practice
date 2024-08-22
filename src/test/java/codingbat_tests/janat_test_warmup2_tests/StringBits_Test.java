package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.StringBits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringBits_Test {

    StringBits stringBits = new StringBits();

    @DataProvider(name = "string_bits")
    public Object[][] dpStringBits(){
        return new Object[][]{
                {"Hello", "Hlo"},
                {"Hi", "H"},
                {"Heeololeo", "Hello"},
                {"HiHiHi", "HHH"},
                {"", ""},
        };
    }

    @Test(description = "Verify String_Bits Function", dataProvider = "string_bits")
    public void stringBitsTest(String str, String exp){
        Assert.assertEquals(stringBits.stringBits(str), exp);
    }
}
