package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTags_Test {

    MakeTags makeTags = new MakeTags();

    @DataProvider(name = "MakeTags")
    public Object[][] dpMaketags(){
        return new Object[][]{
                {"i","Yay","<i>Yay</i>"},
                {"cite", "Yay","<cite>Yay</cite>"},
                {"i", "","<i></i>"},
        };
    }
    @Test(description = "Verify MakeTags Test",dataProvider = "MakeTags")
    public void makeTagsTest(String str1, String str2, String res){
        Assert.assertEquals(makeTags.makeTags(str1,str2),res);
    }
}
