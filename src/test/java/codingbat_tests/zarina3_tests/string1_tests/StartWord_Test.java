package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWord_Test {

    StartWord startWord = new StartWord();
    @DataProvider(name = "StartWord")
    public Object[][] dpStartWord(){
        return new Object[][]{
                {"hippo","hi","hi"},
                {"","i",""},
                {"h","z","h"},
                {"kit","cit","kit"}
        };
    }
@Test(description = "Verify StartWord Test",dataProvider = "StartWord")
    public void startWordTest(String str1, String str2, String res){
    Assert.assertEquals(startWord.startWord(str1,str2),res);
}
}
