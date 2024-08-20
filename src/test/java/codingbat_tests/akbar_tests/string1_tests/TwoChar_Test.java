package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoChar_Test {
    TwoChar twoChar = new TwoChar();

    @DataProvider(name = "twoChar")
    public Object[][] dpTwoChar(){
        return new Object[][]{
                {"java", 0,"ja"},
                {"java", 4,"ja"},
                {"Hello", 0,"He"},
                {"Hello", -7,"He"},
        };
    }

    @Test(description = "Verify TwoChar function",dataProvider = "twoChar")
    public void twoCharTest(String str,int n, String exp){
        Assert.assertEquals(twoChar.twoChar(str,n),exp);
    }
}
