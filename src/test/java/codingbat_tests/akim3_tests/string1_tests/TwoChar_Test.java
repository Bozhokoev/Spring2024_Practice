package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoChar_Test {
    TwoChar twoChar = new TwoChar();

    @DataProvider(name = "two_char")
    public Object[][] dpTwoChar(){
        return new Object[][]{
                {"Hello", 99, "He"},
                {"Hello", -7, "He"},
                {"Hello", 3, "lo"},
                {"java", 0, "ja"}
        };
    }

    @Test(description = "Verify twoChar finction", dataProvider = "two_char")
    public void twoCharTest(String str, int index, String expected){
        Assert.assertEquals(twoChar.twoChar(str, index), expected);
    }
}
