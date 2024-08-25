package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwo_Test {
    LastTwo lastTwo = new LastTwo();

    @DataProvider(name = "lastTwo")
    public Object[][] dpLastTwo(){
        return new Object[][]{
                {"coding","codign"},
                {"cat","cta"},
                {"ab", "ba"},
                {"",""},
        };
    }

    @Test(description = "Verify LastTwo function",dataProvider = "lastTwo")
    public void LastTwo(String s, String exp){
        Assert.assertEquals(lastTwo.lastTwo(s),exp);
    }
}
