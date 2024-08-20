package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWord_Test {
    MakeOutWord makeOutWord = new MakeOutWord();

    @DataProvider(name = "make_out_word")
    public Object[][]dpMakeOutWord(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"}
        };
    }

    @Test(description = "Verify makeOutWord function", dataProvider = "make_out_word")
    public void makeOutWordTest(String out, String word, String expected){
        Assert.assertEquals(makeOutWord.makeOutWord(out, word), expected);
    }
}
