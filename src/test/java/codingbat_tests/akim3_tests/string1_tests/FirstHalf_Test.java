package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalf_Test {
    FirstHalf firstHalf = new FirstHalf();

    @DataProvider(name = "first_half")
    public Object[][] dpFirstHalf(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"ab", "a"},
                {"0123456789", "01234"},
                {"", ""}
        };
    }

    @Test(description = "Verify firstHalf function", dataProvider = "first_half")
    public void firstHalfTest(String str, String expected){
        Assert.assertEquals(firstHalf.firstHalf(str), expected);
    }
}
