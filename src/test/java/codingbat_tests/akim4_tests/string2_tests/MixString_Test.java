package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.MixString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixString_Test {
    MixString mixString = new MixString();

    @DataProvider(name = "mix_string")
    public Object[][] dpMixString(){
        return new Object[][]{
                {"abc", "xyz", "axbycz"},
                {"2/", "27 around", "22/7 around"},
                {"Abc", "", "Abc"},
                {"", "", ""}
        };
    }

    @Test(description = "Verify mix string function", dataProvider = "mix_string")
    public void mixStringTest(String a, String b, String expected){
        Assert.assertEquals(mixString.mixString(a, b), expected);
    }
}
