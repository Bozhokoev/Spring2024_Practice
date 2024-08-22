package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoChar_Test {

    TwoChar twoChar = new TwoChar();

    @DataProvider(name = "TwoChar")
    public Object[][] dpTwoChar(){
        return new Object[][]{
                {"java", 0, "ja"},
                {"hello", -7, "he"},
                {"hello", 99, "he"}
        };
    }

    @Test(description = "Verify TwoChar Test",dataProvider = "TwoChar")
    public void twoCharTest(String str, int n, String res){
        Assert.assertEquals(twoChar.twoChar(str,n),res);
    }
}
