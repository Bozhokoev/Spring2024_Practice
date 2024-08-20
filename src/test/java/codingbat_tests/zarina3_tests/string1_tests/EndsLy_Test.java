package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLy_Test {

    EndsLy endsLy = new EndsLy();

    @DataProvider(name = "EndsLy")
    public Object[][] dpEndsLy() {
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"", false},
                {"evenly", true}
        };
    }

    @Test(description = "Verify EndsLy Test", dataProvider = "EndsLy")
    public void endsLyTest(String str, boolean res) {
        Assert.assertEquals(endsLy.endsLy(str), res);
    }
}
