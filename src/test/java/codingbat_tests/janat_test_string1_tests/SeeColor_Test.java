package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.SeeColor;
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
                {"blueTimes", "blue"},
                {"NoColor", ""},
                {"red", "red"},
        };
    }
    @Test(description = "Verify See_Color Function", dataProvider = "see_color")
    public void seeColorTest(String str, String exp){
        Assert.assertEquals(seeColor.seeColor(str), exp);
    }
}
