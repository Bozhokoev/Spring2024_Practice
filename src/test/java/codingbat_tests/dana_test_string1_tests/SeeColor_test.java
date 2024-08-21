package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColor_test {

    SeeColor seeColor = new SeeColor();

    @DataProvider(name = "seeColor")
    public Object[][] dpSeeColor(){
        return new Object[][]{
                {"redxx", "red"	},
                {"xxred", ""},
                {"blueTimes", "blue"},
                {"NoColor", ""},
                {"red", "red"},
                {"re", ""},
                {"blu", ""},
                {"blue", "blue"},
                {"a", ""},
                {"", ""},
                {"xyzred", ""}
        };
    }

    @Test(description = "Verify SeeColor Functional", dataProvider = "seeColor")
    public void seeColor_test(String str, String res){
        Assert.assertEquals(seeColor.seeColor(str), res);
    }
}
