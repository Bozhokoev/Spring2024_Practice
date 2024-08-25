package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.PlusOut;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PlusOut_Test {
    PlusOut plusOut = new PlusOut();

    @DataProvider(name = "plus_out")
    public Object[][] dpPlusOut(){
        return new Object[][]{
                {"12xy34", "xy", "++xy++"},
                {"abXYabcXYZ", "abc", "++++abc+++"},
                {"--++ab", "++", "++++++"},
                {"123123", "3", "++3++3"}
        };
    }

    @Test(description = "Verify plus out function", dataProvider = "plus_out")
    public void plusOutTest(String a, String b, String expected){
        Assert.assertEquals(plusOut.plusOut(a, b), expected);
    }
}
