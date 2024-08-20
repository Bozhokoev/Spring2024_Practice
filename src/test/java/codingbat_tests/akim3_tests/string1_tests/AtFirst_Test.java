package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirst_Test {
    AtFirst atFirst = new AtFirst();

    @DataProvider(name = "at_first")
    public Object[][] dpAtFirst(){
        return new Object[][]{
                {"hello", "he"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"}
        };
    }

    @Test(description = "Verify atFirst function", dataProvider = "at_first")
    public void atFirstTest(String str, String expected){
        Assert.assertEquals(atFirst.atFirst(str), expected);
    }
}
