package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEnd_test {

    ExtraEnd extraEnd = new ExtraEnd();

    @DataProvider(name = "extraEnd")
    public Object[][] dpExtraEnd(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }
    @Test(description = "Verify ExtraEnd Functional", dataProvider = "extraEnd")
    public void extraEnd_test(String str, String res){
        Assert.assertEquals(extraEnd.extraEnd(str), res);
    }
}
