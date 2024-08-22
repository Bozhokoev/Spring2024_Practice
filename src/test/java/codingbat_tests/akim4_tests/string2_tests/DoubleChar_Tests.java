package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.DoubleChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleChar_Tests {
    DoubleChar doubleChar = new DoubleChar();

    @DataProvider(name = "double_char")
    public Object[][] dpDoubleChar(){
        return new Object[][]{
                {"The", "TThhee"},
                {"!!", "!!!!"},
                {".", ".."}
        };
    }

    @Test(description = "Verify doubleChar function", dataProvider = "double_char")
    public void doubleCharTest(String str, String expected){
        Assert.assertEquals(doubleChar.doubleChar(str), expected);
    }
}
