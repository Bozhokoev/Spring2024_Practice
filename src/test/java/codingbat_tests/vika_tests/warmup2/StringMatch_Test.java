package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.StringMatch;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringMatch_Test {
    StringMatch stringMatch = new StringMatch();

    @DataProvider(name = "string_match")
    public Object[][] dpStringMatch() {
        return new Object[][] {
                {"xxcaazz", "xxbaaz", 3},
                {"abc", "abc", 2 },
                {"he", "hello", 1},
                {"", "hello", 0},
                {"iaxxai", "aaxxaaxx", 3}
        };
    }

    @Test(description = "Verify String Match Function", dataProvider = "string_match")
    public void stringMatchTest (String a, String b, int exp) {
        Assert.assertEquals(stringMatch.stringMatch(a, b), exp);
    }
}
