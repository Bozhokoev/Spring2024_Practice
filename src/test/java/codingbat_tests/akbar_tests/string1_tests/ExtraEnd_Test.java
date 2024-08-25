package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEnd_Test {
    ExtraEnd extraEnd = new ExtraEnd();

    @DataProvider(name = "extraEnd")
    public Object[][] dpExtraEnd() {
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Code", "dedede"},
                {"Candy", "dydydy"},
        };
    }

    @Test(description = "Verify extraEnd function", dataProvider = "extraEnd")
    public void extraEndTest (String s, String exp){
        Assert.assertEquals(extraEnd.extraEnd(s),exp);
    }
}
