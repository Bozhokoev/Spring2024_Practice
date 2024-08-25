package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEnd_Test {
    TheEnd theEnd = new TheEnd();

    @DataProvider(name = "the_end")
    public Object[][] dpTheEnd(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
        };
    }
    @Test(description = "Verify The_End Function", dataProvider = "the_end")
    public void theEndTest(String str, boolean n, String exp){
        Assert.assertEquals(theEnd.theEnd(str, n), exp);
    }
}
