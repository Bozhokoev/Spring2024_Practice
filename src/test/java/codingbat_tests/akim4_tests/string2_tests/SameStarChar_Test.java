package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.SameStarChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameStarChar_Test {
    SameStarChar sameStarChar = new SameStarChar();

    @DataProvider(name = "same_star_char")
    public Object[][] dpSameStarChar(){
        return new Object[][]{
                {"xy*yzz", true},
                {"*xa*a*", true},
                {"12*2*3*", false},
                {"*xa*a*b", false},
                {"*", true}
        };
    }

    @Test(description = "Verify same star char", dataProvider = "same_star_char")
    public void sameStarChar(String str, boolean expected){
        Assert.assertEquals(sameStarChar.sameStarChar(str), expected);
    }
}
