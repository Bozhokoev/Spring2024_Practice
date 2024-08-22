package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTags_Test {
    MakeTags makeTags = new MakeTags();

    @DataProvider(name = "make_tags")
    public Object[][] dpMakeTags(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"},
                {"body", "Heart", "<body>Heart</body>"},
        };
    }
    @Test(description = "Verify Make_Tags Function", dataProvider = "make_tags")
    public void makeTagsTest(String str, String str1, String exp){
        Assert.assertEquals(makeTags.makeTags(str, str1), exp);
    }
}
