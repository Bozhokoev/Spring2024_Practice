package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastChars_Test {
    LastChars lastChars = new LastChars();

    @DataProvider(name = "last_chars")
    public Object[][] dpLastChars(){
        return new Object[][]{
                {"last", "chars", "ls"},
                {"hi", "", "h@"},
                {"", "", "@@"},
                {"k", "zip", "kp"}
        };
    }

    @Test(description = "Verify lastChars function", dataProvider = "last_chars")
    public void lastCharsTest(String a, String b, String expected){
        Assert.assertEquals(lastChars.lastChars(a, b), expected);
    }
}
