package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastChars_Test {
    LastChars lastChars = new LastChars();

    @DataProvider(name = "lastChars")
    public Object[][] dpLastChars(){
        return new Object[][]{
                {"last", "chars","ls"},
                {"", "", "@@"},
                {"kitten", "","k@"},
                {"kitten", "hi","ki"},
                {"", "hello", "@o"},
        };
    }

    @Test(description = "Verify LastChars function",dataProvider = "lastChars")
    public void lastCharsTest(String a, String b, String exp){
        Assert.assertEquals(lastChars.lastChars(a,b),exp);
    }

}
