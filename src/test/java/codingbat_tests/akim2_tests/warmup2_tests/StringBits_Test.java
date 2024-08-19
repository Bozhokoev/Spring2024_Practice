package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.StringBits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringBits_Test {
    StringBits stringBits = new StringBits();

    @DataProvider(name = "string_bits")
    public Object[][]dpStringBits(){
        return new Object[][]{
                {"Hello", "Hlo"},
                {"Heeololeo", "Hello"},
                {"Greetings", "Getns"},
                {"Hello Kitten", "HloKte"},
                {"", ""}
        };
    }

    @Test(description = "Verify StringBits function", dataProvider = "string_bits")
    public void stringBitsTest(String str, String expected){
        Assert.assertEquals(stringBits.stringBits(str), expected);
    }
}
