package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2_Test {
    Without2 without2 = new Without2();

    @DataProvider(name = "without2")
    public Object[][] dpWithout2(){
        return new Object[][]{
                {"HelloHe", "lloHe"},
                {"Chocolate", "Chocolate"},
                {"xx", ""},
                {"x", "x"}
        };
    }

    @Test(description = "Verify without2 function", dataProvider = "without2")
    public void without2Test(String str, String expected){
        Assert.assertEquals(without2.without2(str), expected);
    }
}
