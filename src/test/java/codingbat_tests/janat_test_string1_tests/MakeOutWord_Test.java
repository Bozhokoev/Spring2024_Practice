package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWord_Test {
    MakeOutWord makeOutWord = new MakeOutWord();

    @DataProvider(name = "make_out_word")
    public Object[][] dpMakeOutWord(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"},
        };
    }
    @Test(description = "Verify Make_Out_Word", dataProvider = "make_out_word")
    public void makeOutWordTest(String str, String str1, String exp){
        Assert.assertEquals(makeOutWord.makeOutWord(str, str1), exp);
    }
}
