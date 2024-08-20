package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEnd_Test {
    TheEnd theEnd = new TheEnd();

    @DataProvider(name = "the_end")
    public Object[][]dpTheEnd(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"chocolate", false, "e"},
                {"1234", true, "1"},
                {"x", false, "x"}
        };
    }

    @Test(description = "Verify theEnd function", dataProvider = "the_end")
    public void theEndTest(String str, boolean front, String expected){
        Assert.assertEquals(theEnd.theEnd(str, front), expected);
    }
}
