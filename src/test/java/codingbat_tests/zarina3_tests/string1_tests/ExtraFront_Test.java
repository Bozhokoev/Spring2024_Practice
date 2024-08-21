package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFront_Test {

    ExtraFront extraFront = new ExtraFront();
    @DataProvider(name = "ExtraFront")
    public Object[][] dpExtraFront(){
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"", ""},
                {"H", "HHH"},
                {"Candy", "CaCaCa"}
        };
    }
    @Test(description = "Verify ExtraFront Test",dataProvider = "ExtraFront")
    public void extraFrontTest(String str, String res){
        Assert.assertEquals(extraFront.extraFront(str),res);
    }
}
