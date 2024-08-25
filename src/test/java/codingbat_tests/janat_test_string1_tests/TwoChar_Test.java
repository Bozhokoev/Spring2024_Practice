package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoChar_Test {
    TwoChar twoChar = new TwoChar();

    @DataProvider(name = "two_char")
    public Object[][] dpTwoChar(){
        return new Object[][]{
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", 3, "ja"},
                {"java", 4, "ja"},
                {"java", -1, "ja"},
        };
    }
    @Test(description = "Verify Two_Char Function", dataProvider = "two_char")
    public void twoCharTest(String str, int n, String exp){
        Assert.assertEquals(twoChar.twoChar(str, n), exp);
    }
}
