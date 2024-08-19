package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.StringMatch;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringMatch_test {

    StringMatch stringMatch = new StringMatch();

    @DataProvider(name = "stringMatch")
    public Object[][] dpStringMatch(){
        return new Object[][]{
                {"xxcaazz", "xxbaaz", 3},
                {"abc", "abc", 2},
                {"abc", "axc", 0},
                {"hello", "he", 1},
                {"he", "hello", 1},
                {"h", "hello", 0},
                {"", "hello", 0},
                {"aabbccdd", "abbbxxd", 1},
                {"aaxxaaxx", "iaxxai", 3},
                {"iaxxai", "aaxxaaxx", 3}
        };
    }

    @Test(description = "Verify StringMatch Functional", dataProvider = "stringMatch")
    public void stringMatch_test(String str, String str1, int res){
        Assert.assertEquals(stringMatch.stringMatch(str, str1), res);
    }
}
