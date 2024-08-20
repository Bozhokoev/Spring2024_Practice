package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTags_Test {
    MakeTags makeTags = new MakeTags();

    @DataProvider(name = "makeTags")
    public Object[][] dpMakeTags() {
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "", "<i></i>"},
                {"body", "Heart", "<body>Heart</body>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
        };
    }

    @Test(description = "Verify makeTags", dataProvider = "makeTags")
    public void makeTagsTest(String a, String b, String exp) {
        Assert.assertEquals(makeTags.makeTags(a, b), exp);
    }
}
