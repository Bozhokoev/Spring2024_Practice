package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoChar_test {

    TwoChar twoChar = new TwoChar();

    @DataProvider(name = "twoChar")
    public Object[][] dpTwoChar(){
        return new Object[][]{
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", 3, "ja"},
                {"java", 4, "ja"},
                {"java", -1, "ja"},
                {"Hello", 0, "He"},
                {"Hello", 1, "el"},
                {"Hello", 99, "He"},
                {"Hello", 3, "lo"},
                {"Hello", 4, "He"},
                {"Hello", 5, "He"},
                {"Hello", -7, "He"},
                {"Hello", 6, "He"},
                {"Hello", -1, "He"},
                {"yay", 0, "ya"}
        };
    }

    @Test(description = "Verify TwoChar functional", dataProvider = "twoChar")
    public  void twoChar_test(String str, int num, String res){
        Assert.assertEquals(twoChar.twoChar(str, num), res);
    }
}
