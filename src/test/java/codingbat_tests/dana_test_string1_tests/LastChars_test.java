package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastChars_test {

    LastChars lastChars = new LastChars();

    @DataProvider(name = "lastChars")
    public Object[][] dpLastChars(){
        return new Object[][]{
                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"hi", "", "h@"},
                {"", "hello", "@o"},
                {"", "", "@@"},
                {"kitten", "hi", "ki"},
                {"k", "zip", "kp"},
                {"kitten", "", "k@"},
                {"kitten", "zip", "kp"}
        };
    }

    @Test(description = "lastChars", dataProvider = "lastChars")
    public void lastChars_test(String str1, String str2, String res){
        Assert.assertEquals(lastChars.lastChars(str1, str2), res);
    }
}
