package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwo_test {

    LastTwo lastTwo = new LastTwo();

    @DataProvider(name = "lastTwo")
    public Object[][] dpLastTwo(){
        return new Object[][]{
                {"coding", "codign"	},
                {"cat", "cta"},
                {"ab", "ba"},
                {"a", "a"},
                {"", ""}
        };
    }

    @Test(description = "Verify LastTwo Functional", dataProvider = "lastTwo")
    public void lastTwo_test(String str, String res){
        Assert.assertEquals(lastTwo.lastTwo(str), res);
    }
}
