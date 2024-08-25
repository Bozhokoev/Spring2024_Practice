package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWord_Test {

    MakeOutWord makeOutWord = new MakeOutWord();

    @DataProvider(name = "MakeOutWord")
    public Object[][] dpMakeOutWord(){
        return new Object[][]{
                {"<<>>", "Yay","<<Yay>>"},
                {"[[]]", "word","[[word]]"},
                {"abyz", "YAY","abYAYyz"},
        };
    }
    @Test(description = "Verify MakeOutWord Test",dataProvider = "MakeOutWord")
    public void makeOutWordTest(String str1,String str2, String res){
        Assert.assertEquals(makeOutWord.makeOutWord(str1,str2),res);
    }
}
