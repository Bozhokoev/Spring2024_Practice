package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWord_Test {
    StartWord startWord = new StartWord();

    @DataProvider(name = "start_word")
    public Object[][] dpStartWord(){
        return new Object[][]{
                {"hippo", "hi", "hi"},
                {"hippo", "xip", "hip"},
                {"hippo", "i", "h"},
                {"hippo", "ix", ""},
                {"h", "ix", ""},
        };
    }
    @Test(description = "Verify Start_Word Function", dataProvider = "start_word")
    public void startWordTest(String str, String str1, String exp){
        Assert.assertEquals(startWord.startWord(str, str1), exp);
    }
}
