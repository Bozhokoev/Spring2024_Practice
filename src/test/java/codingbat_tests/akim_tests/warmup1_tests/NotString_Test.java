package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.NotString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NotString_Test {
    NotString notString = new NotString();

    @DataProvider(name = "not_string")
    public Object[][] dpNotString(){
        return new Object[][]{
                {"candy", "not candy"},
                {"x", "not x"},
                {"not bad", "not bad"},
                {"bad", "not bad"}
        };
    }

    @Test(description = "Verify not string function", dataProvider = "not_string")
    public void notStringTest(String str, String expected){
        Assert.assertEquals(notString.notString(str), expected);
    }
}
