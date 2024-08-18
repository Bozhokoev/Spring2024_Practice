package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.MissingChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MissingCharTest {

    @DataProvider(name = "missingCharData")
    public Object [][] missingCharData(){
        return new Object[][]{
                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"}
        };
    }

    @Test(dataProvider = "missingCharData")
    public void testMissingChar(String str, int n, String except) {
        MissingChar missingChar = new MissingChar();
        String result = missingChar.missingChar(str, n);
        assertEquals(result, except);
    }
}
