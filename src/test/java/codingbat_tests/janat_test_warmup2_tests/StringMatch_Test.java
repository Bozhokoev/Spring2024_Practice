package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.StringMatch;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringMatch_Test {
    StringMatch stringMatch = new StringMatch();

    @DataProvider(name = "string_match")
    public Object[][] dpStringMatch(){
        return new Object[][]{
                 {"xxcaazz", "xxbaaz", 3},
                 {"abc", "abc", 2},
                 {"abc", "axc", 0},
                 {"hello", "he", 1},
                 {"he", "hello", 1},

        };
    }

    @Test(description = "Verify String_Match Function", dataProvider = "string_match")
    public void stringMatchTest(String a, String b, int exp){
        Assert.assertEquals(stringMatch.stringMatch(a, b), exp);
    }
}
