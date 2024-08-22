package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.LastTwo;
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
                {"ab", "ba"},
                {"a", "a"},
                {"", ""},
        };
    }
    @Test(description = "Verify Last_Two Function", dataProvider = "last_two")
    public void lastTwoTest(String str, String exp){
        Assert.assertEquals(lastTwo.lastTwo(str), exp);
    }
}
