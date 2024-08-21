package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.StartWord;
import org.testng.Assert;
import org.testng.SuiteRunner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWord_test {

    StartWord startWord = new StartWord();

    @DataProvider(name = "startWord")
    public Object[][] dpStartWord(){
        return new Object[][]{
                {"hippo", "hi", "hi"},
                {"hippo", "xip", "hip"},
                {"hippo", "i", "h"},
                {"hippo", "ix", ""},
                {"h", "ix", ""},
                {"", "i", ""},
                {"hip", "zi", "hi"},
                {"hip", "zip", "hip"},
                {"hip", "zig", ""},
                {"h", "z", "h"},
                {"hippo", "xippo", "hippo"},
                {"hippo", "xyz", ""},
                {"hippo", "hip", "hip"},
                {"kitten", "cit", "kit"},
                {"kit", "cit", "kit"}
        };
    }

    @Test(description = "Verify StartWord Functional", dataProvider = "startWord")
    public void startWord_test(String str1, String str2, String res){
        Assert.assertEquals(startWord.startWord(str1, str2), res);
    }
}
