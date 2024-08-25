package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEnd_Test {
    TheEnd theEnd = new TheEnd();

    @DataProvider(name = "theEnd")
    public Object[][] dpTheEnd(){
        return new Object[][]{
                {"Hello", true,"H"},
                {"x", false,"x"},
                {"java", true, "j"},
                {"code", false,"e"},
        };
    }

    @Test(description = "Verify theEnd function",dataProvider = "theEnd")
    public void theEndTest(String s,boolean b, String exp){
        Assert.assertEquals(theEnd.theEnd(s,b),exp);
    }
}
