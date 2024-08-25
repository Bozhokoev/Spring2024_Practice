package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.GetSandwich;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetSandwich_Test {
    GetSandwich getSandwich = new GetSandwich();

    @DataProvider(name = "get_sandwich")
    public Object[][] dpGetSandwich(){
        return new Object[][]{
                {"breadjambread", "jam"},
                {"xxbreadbreadjambreadyy", "breadjam"},
                {"abcbreaz", ""}
        };
    }

    @Test(description = "Verify get sandwich function", dataProvider = "get_sandwich")
    public void getSandwichTest(String str, String expected){
        Assert.assertEquals(getSandwich.getSandwich(str), expected);
    }
}
