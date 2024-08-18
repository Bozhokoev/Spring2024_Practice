package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.NotString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NotStringTest {
    NotString notString = new NotString();

    @DataProvider(name = "notString")
    public Object [][] dpNotString(){
        return new Object[][]{
                {"candy", "not candy"},
                {"x", "not x"},
                {"not bad", "not bad"},
                {"bad", "not bad"},
                {"not", "not"},
                {"is not", "not is not"},
                {"no", "not no"}
        };
    }

    @Test(description = "Verify Not String", dataProvider = "notString")
    public void notString_test(String str, String res){
        Assert.assertEquals(notString.notString(str),res);
}
}
