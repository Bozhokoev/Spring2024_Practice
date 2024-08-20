package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingChar_Test {

    MissingChar missingChar = new MissingChar();

    @DataProvider(name = "MissingChar")
    public Object[][] dpMissingChar(){
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"Hi", 1, "H"},
                {"code", 0, "ode"},
                {"code", 1, "cde"},
                {"code", 2, "coe"},
                {"code", 3, "cod"},
                {"chocolate", 8, "chocolat"}
        };
    }

    @Test(description = "Verify MissingChar Function", dataProvider = "MissingChar")
    public void missingChar_test(String str, int a, String res){
        Assert.assertEquals(missingChar.missingChar(str, a), res);
    }
}

