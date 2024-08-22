package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.LastChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastChar_Test {
    LastChar lastChar = new LastChar();

    @DataProvider(name = "LastChar")
    public Object[][] dpLastChar(){
        return new Object[][]{
                {"last","chars", "ls"},
                {"","hello", "@o"},
                {"k","zip", "kp"},
                {"","", "@@"},
        };
    }
    @Test(description = "Verify LastChar Test", dataProvider = "LastChar")
    public void lastCharTest(String str1, String str2, String res){
        Assert.assertEquals(lastChar.lastChars(str1,str2),res);
    }
}
