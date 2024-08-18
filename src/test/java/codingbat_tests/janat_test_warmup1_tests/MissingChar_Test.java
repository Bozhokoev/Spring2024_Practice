package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingChar_Test {

    MissingChar  missingChar = new MissingChar();

    @DataProvider(name = "missing_char")
    public Object[][] dpMissingChar(){
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"Hi", 1, "H"},
        };
    }

    @Test(description = "Verify Missing_Char Function", dataProvider = "missing_char")
    public void missingCharTest(String str, int n, String exp){
        Assert.assertEquals(missingChar.missingChar(str, n), exp);
    }
}
