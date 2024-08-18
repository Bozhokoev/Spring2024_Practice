package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingChar_Test {
    MissingChar missingChar = new MissingChar();

    @DataProvider(name = "missing_char")
    public Object[][] dpMissingChar(){
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"code", 3, "cod"},
        };
    }

    @Test(description = "Verify missing char function", dataProvider = "missing_char")
    public void missingChar(String str, int index, String expected){
        Assert.assertEquals(missingChar.missingChar(str, index), expected);
    }
}
