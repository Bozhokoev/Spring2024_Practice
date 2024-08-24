package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.PrefixAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrefixAgain_Test {
    PrefixAgain prefixAgain = new PrefixAgain();

    @DataProvider(name = "prefix_again")
    public Object[][] dpPrefixAgain(){
        return new Object[][]{
                {"abXYabc", 1, true},
                {"Hi12345Hi6789Hi10", 1, true},
                {"Hi12345Hi6789Hi10", 4, false}
        };
    }

    @Test(description = "Verify prefix again function", dataProvider = "prefix_again")
    public void prefixAgainTest(String str, int index, boolean expected){
        Assert.assertEquals(prefixAgain.prefixAgain(str, index), expected);
    }
}
