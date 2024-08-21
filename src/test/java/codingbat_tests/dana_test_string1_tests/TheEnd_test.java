package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEnd_test {

    TheEnd theEnd = new TheEnd();

    @DataProvider(name = "theEnd")
    public Object[][] dpTheEnd(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
                {"x", false, "x"},
                {"java", true, "j"},
                {"chocolate", false, "e"},
                {"1234", true, "1"},
                {"code", false, "e"}
        };
    }

    @Test(description = "Verify TheEnd Functional", dataProvider = "theEnd")
    public void theEnd_test(String a, boolean b, String res){
        Assert.assertEquals(theEnd.theEnd(a, b), res);
    }
}
