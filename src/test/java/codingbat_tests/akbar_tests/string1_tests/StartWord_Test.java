package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWord_Test {
    StartWord startWord = new StartWord();

    @DataProvider(name = "startWord")
    public Object[][] dpStartWord(){
        return new Object[][]{
                {"hippo", "hi","hi"},
                {"h", "ix",""},
                {"", "i", ""},
                {"h", "z","h"},
                {"hip", "zip","hip"},
        };
    }

    @Test(description = "Verify StartWord function",dataProvider = "startWord")
    public void startWord(String a, String b,String exp){
        Assert.assertEquals(startWord.startWord(a,b),exp);
    }
}
