package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColor_Test {
    SeeColor seeColor = new SeeColor();

    @DataProvider(name = "SeeColor")
    public Object[][] dpSeeColor() {
        return new Object[][]{
                {"redxx", "red"},
                {"xxred", ""},
                {"no color", ""},
                {"blue", "blue"}
        };
    }

    @Test(description = "Verify SeeColor Test", dataProvider = "SeeColor")
  public void seeColorTest(String str, String res){
      Assert.assertEquals(seeColor.seeColor(str),res);
    }
}
