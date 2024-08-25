package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.StarOut;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StarOut_Test {
    StarOut starOut = new StarOut();

    @DataProvider(name = "star_out")
    public Object[][] dpStarOut(){
        return new Object[][]{
                {"ab*cd", "ad"},
                {"*stringy", "tringy"},
                {"a*b", ""},
                {"*a", ""}
        };
    }

    @Test(description = "Verify star out function", dataProvider = "star_out")
    public void starOutTest(String str, String expected){
        Assert.assertEquals(starOut.starOut(str), expected);
    }
}
