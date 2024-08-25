package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTags_test {

    MakeTags makeTags = new MakeTags();

    @DataProvider(name = "makeTags")
    public Object[][] dpMakeTags(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"},
                {"body", "Heart", "<body>Heart</body>"},
                {"i", "i", "<i>i</i>"},
                {"i", "", "<i></i>"}
        };
    }

    @Test(description = "Verify Make Tags Functional", dataProvider = "makeTags")
    public void makeTags_test(String a, String b, String res){
        Assert.assertEquals(makeTags.makeTags(a, b), res);
    }
}
