package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.RepeatEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RepeatEnd_Test {
    RepeatEnd repeatEnd = new RepeatEnd();

    @DataProvider(name = "repeat_end")
    public Object[][] dpRepeatEnd(){
        return new Object[][]{
                {"Hello", 3, "llollollo"},
                {"1234", 2, "3434"},
                {"", 0, ""}
        };
    }

    @Test(description = "Verify repeat end function", dataProvider = "repeat_end")
    public void repeatEndTest(String str, int index, String expected){
        Assert.assertEquals(repeatEnd.repeatEnd(str, index), expected);
    }
}
