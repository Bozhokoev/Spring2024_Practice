package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWord_test {

    MakeOutWord makeOutWord = new MakeOutWord();

    @DataProvider(name = "makeOutWord")
    public Object [][] dpMakeOutWord(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }

    @Test(description = "Verify MakeOutWord Functional", dataProvider = "makeOutWord")
    public void makeOutWord_test(String a, String b, String res){
        Assert.assertEquals(makeOutWord.makeOutWord(a, b), res);
    }
}
