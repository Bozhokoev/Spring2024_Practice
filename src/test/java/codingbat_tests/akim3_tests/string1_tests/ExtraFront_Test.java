package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFront_Test {
    ExtraFront extraFront = new ExtraFront();

    @DataProvider(name = "extra_front")
    public Object[][] dpExtraFront(){
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"Candy", "CaCaCa"},
                {"H", "HHH"}
        };
    }

    @Test(description = "Verify extraFront function", dataProvider = "extra_front")
    public void extraFrontTest(String str, String expected){
        Assert.assertEquals(extraFront.extraFront(str), expected);
    }
}
