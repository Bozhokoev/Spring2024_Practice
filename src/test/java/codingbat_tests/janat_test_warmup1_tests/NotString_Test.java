package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.NotString;
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
                {"bad", "not bad"},
                {"not", "not"},
        };
    }

    @Test(description = "Verify Not_String Function", dataProvider = "not_string")
    public void notStringTest(String str, String exp){
        Assert.assertEquals(notString.notString(str), exp);
    }
}
