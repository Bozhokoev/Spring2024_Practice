package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColor_Test {
    SeeColor seeColor = new SeeColor();

    @DataProvider(name = "seeColor")
    public Object[][] dpSeeColor(){
        return new Object[][]{
                {"redxx","red"},
                {"blue", "blue"},
                {"re",""},
                {"",""},
        };
    }

    @Test(description = "Verify SeeColor function",dataProvider = "seeColor")
    public void seeColorTest(String str,String exp){
        Assert.assertEquals(seeColor.seeColor(str),exp);
    }

}
