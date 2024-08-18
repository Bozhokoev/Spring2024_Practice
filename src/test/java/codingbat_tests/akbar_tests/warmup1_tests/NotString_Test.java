package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.NotString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NotString_Test {
    NotString notString = new NotString();

    @DataProvider(name = "notString")
    public Object[][] dpnotString(){
        return new Object[][]{
                {"candy","not candy"},
                {"x","not x"},
                {"not bad","not bad"},
                {"bad","not bad"},
                {"not","not"},
                {"is not","not is not"},
        };
    }

    @Test(description = "Verify NotString function", dataProvider = "notString")
    public void notStringTest(String str, String res){
        Assert.assertEquals(notString.notString(str),res);
    }
}
