package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWord_Test {
    StartWord startWord = new StartWord();

    @DataProvider(name = "start_word")
    public Object[][] dpStartWord(){
        return new Object[][]{
                {"h", "ix", ""},
                {"hippo", "xippo", "hippo"},
                {"kitten", "cit", "kit"}
        };
    }

    @Test(description = "Verify startWord function", dataProvider = "start_word")
    public void startWordTest(String str, String word, String expected){
        Assert.assertEquals(startWord.startWord(str, word), expected);
    }
}
