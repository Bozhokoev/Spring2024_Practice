package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwo_Test {
    LastTwo lastTwo = new LastTwo();

    @DataProvider(name = "last_two")
    public Object[][] dpLastTwo(){
        return new Object[][]{
                {"coding", "codign"},
                {"cat", "cta"},
                {"", ""}
        };
    }

    @Test(description = "Verify lastTwo function", dataProvider = "last_two")
    public void lastTwoTest(String str, String expected){
        Assert.assertEquals(lastTwo.lastTwo(str), expected);
    }
}
