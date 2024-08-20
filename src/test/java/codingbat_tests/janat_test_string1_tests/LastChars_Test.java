package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastChars_Test {
    LastChars lastChars = new LastChars();

    @DataProvider(name = "last_chars")
    public Object[][] dpLastChars(){
        return new Object[][]{
                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"hi", "", "h@"},
                {"", "hello", "@o"},
                {"", "", "@@"},
        };
    }
    @Test(description = "Verify Last_Chars Function", dataProvider = "last_chars")
    public void lastCharsTest(String str, String str1, String exp){
        Assert.assertEquals(lastChars.lastChars(str, str1), exp);
    }
}
