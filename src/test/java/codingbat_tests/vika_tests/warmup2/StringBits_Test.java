package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.StringBits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringBits_Test {
    StringBits stringBits =  new StringBits();

    @DataProvider(name = "string_bits")
    public Object[][] dpStringBits() {
        return new Object[][] {
                {"Hello", "Hlo"},
                {"HiHiHi", "HHH"},
                {"Greetings", "Getns"},
                {"pi", "p"}
        };
    }

    @Test(description = "Verify String Bits Function", dataProvider = "string_bits")
    public void stringBitsTest (String str, String exp) {
        Assert.assertEquals(stringBits.stringBits(str), exp);
    }
}
