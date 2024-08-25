package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.NotString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NotString_Test {
    NotString notString_t = new NotString();

    @DataProvider(name = "NotString")
    public Object[][] dpNotString(){
        return new Object[][]{
                {"candy", "not candy"},
                {"x", "not x"},
                {"bad", "not bad"}
        };
    }

    @Test(description = "Verify NotString Function", dataProvider = "NotString")
    public void notStringTest(String a, String exp){
        Assert.assertEquals(notString_t.notString(a), exp);
    }
}
