package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwo_Test {
    LastTwo lastTwo = new LastTwo();

    @DataProvider(name = "LastTwo")
    public Object[][] dpLastTwo(){
        return new Object[][]{
                {"coding","codign"},
                {"cat","cta"},
                {"ab","ba"},
                {"",""}
        };
    }
    @Test(description = "Verify Last Two test", dataProvider = "LastTwo")
    public void lastTwoTest(String str, String res){
        Assert.assertEquals(lastTwo.lastTwo(str),res);
    }
}
