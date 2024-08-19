package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.StringMatch;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringMatch_Test {
    StringMatch stringMatch = new StringMatch();

    @DataProvider(name = "string_match")
    public Object[][] dpStringMatch(){
        return new Object[][]{
                {"xxcaazz", "xxbaaz", 3},
                {"abc", "axc", 0},
                {"h", "hello", 0},
                {"iaxxai", "aaxxaaxx", 3},
                {"aabbccdd", "abbbxxd", 1}
        };
    }

    @Test(description = "Verify stringMatch function", dataProvider = "string_match")
    public void stringMatchTest(String str, String str2, int expected){
        Assert.assertEquals(stringMatch.stringMatch(str, str2), expected);
    }
}
