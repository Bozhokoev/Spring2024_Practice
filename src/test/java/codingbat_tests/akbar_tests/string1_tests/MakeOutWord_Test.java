package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWord_Test {
    MakeOutWord makeOutWord = new MakeOutWord();

    @DataProvider(name = "makeOutWord")
    public Object[][] dpMakeOutWord() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"abyz", "YAY", "abYAYyz"},
        };
    }

    @Test(description = "Verify makeOutWord fuction", dataProvider = "makeOutWord")
    public void makeOutWordTest(String a, String b, String exp) {
        Assert.assertEquals(makeOutWord.makeOutWord(a, b), exp);
    }
}
