package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingChar_Test {
    MissingChar missingChar = new MissingChar();

    @DataProvider(name = "missingChar")
    public Object[][] dpMissChar() {
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"code", 3, "cod"},
                {"chocolate", 8, "chocolat"},
        };
    }

    @Test(description = "Verify MissingChar function", dataProvider = "missingChar")
    public void missingCharTest(String str, int a , String res){
        Assert.assertEquals(missingChar.missingChar(str,a),res);
    }
}
