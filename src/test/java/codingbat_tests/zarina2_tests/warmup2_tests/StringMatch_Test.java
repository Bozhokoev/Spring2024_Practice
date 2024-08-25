package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.StringMatch;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringMatch_Test {
    StringMatch stringMatch = new StringMatch();

    @DataProvider (name = "StringMatch")
    public Object [][] dpStringMatch(){
        return new Object[][]{
                {"h", "hello",0},
                {"abc", "abc",2},
                {"he", "hello",1}

        };
    }
    @Test(description = "Verify StringMatch Function", dataProvider = "StringMatch")
    public void stringMatchTest(String str1, String str2, int x){
        Assert.assertEquals(stringMatch.stringMatch(str1,str1),x);
    }
}
