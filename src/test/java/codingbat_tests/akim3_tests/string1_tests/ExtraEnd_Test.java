package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEnd_Test {
    ExtraEnd extraEnd = new ExtraEnd();

    @DataProvider(name = "extra_end")
    public Object[][] dpExtraEnd(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }

    @Test(description = "Verify extraEnd function", dataProvider = "extra_end")
    public void extraEndTest(String str, String expected){
        Assert.assertEquals(extraEnd.extraEnd(str), expected);
    }
}
