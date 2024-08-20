package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTags_Test {
    MakeTags makeTags = new MakeTags();

    @DataProvider(name = "make_tags")
    public Object[][] dpMakeTags(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"}
        };
    }

    @Test(description = "Verify makeTags function", dataProvider = "make_tags")
    public void makeTagsTest(String str, String word, String expected){
        Assert.assertEquals(makeTags.makeTags(str, word), expected);
    }
}
