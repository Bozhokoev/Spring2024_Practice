package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColor_Test {
    SeeColor seeColor = new SeeColor();

    @DataProvider(name = "see_color")
    public Object[][] dpSeeColor(){
        return new Object[][]{
                {"redxx", "red"},
                {"xxred", ""},
                {"NoColor", ""},
                {"blue", "blue"}
        };
    }

    @Test(description = "Verify seeColor function", dataProvider = "see_color")
    public void seeColorTest(String str, String expected){
        Assert.assertEquals(seeColor.seeColor(str), expected);
    }
}
