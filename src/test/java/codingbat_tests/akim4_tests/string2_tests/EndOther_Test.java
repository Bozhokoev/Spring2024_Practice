package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.EndOther;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndOther_Test {
    EndOther endOther = new EndOther();

    @DataProvider(name = "end_other")
    public Object[][] dpEndOther(){
        return new Object[][]{
                {"Hiabc", "abc", true},
                {"Hiabc", "abcd", false},
                {"Hiabcx", "bc", false},
                {"Z", "12xz", true},
                {"ab", "12ab", true}
        };
    }

    @Test(description = "Verify endOther function", dataProvider = "end_other")
    public void endOtherTest(String a, String b, boolean expected){
        Assert.assertEquals(endOther.endOther(a, b), expected);
    }
}
