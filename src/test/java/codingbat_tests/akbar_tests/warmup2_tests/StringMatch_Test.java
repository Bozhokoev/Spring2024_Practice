package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.StringMatch;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringMatch_Test {
    StringMatch stringMatch = new StringMatch();

    @DataProvider(name = "stringMatch")
    public Object[][] dpStringMatch(){
        return new Object[][]{
                {"xxcaazz", "xxbaaz", 3},
                {"abc", "axc",0},
                {"", "hello",0},
                {"aabbccdd", "abbbxxd", 1},
                {"iaxxai", "aaxxaaxx", 3},
        };
    }

    @Test(description = "Verify StringMatch function", dataProvider = "stringMatch")
    public void stringMatchTest(String a, String b, int exp){
        Assert.assertEquals(stringMatch.stringMatch(a,b),exp);
    }
}
