package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingChar_Test {
    MissingChar missingChar_t = new MissingChar();

    @DataProvider(name = "MissingChar")
    public Object[][] dpMissingChar(){
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 3, "kiten"},
                {"kitten", 5, "kitte"}
        };
    }

    @Test(description = "Verify MissingChar Function", dataProvider = "MissingChar")
    public void missingCharTest(String a, int num, String exp){
        Assert.assertEquals(missingChar_t.missingChar(a, num), exp);
    }
}
