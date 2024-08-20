package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLy_Test {
    EndsLy endsLy = new EndsLy();

    @DataProvider(name = "ends_ly")
    public Object[][] dpEndsLy(){
        return new Object[][]{
                {"oddly", true},
                {"oddl", false},
                {"falsey", false},
                {"evenly", true}
        };
    }

    @Test(description = "Verify endsly function", dataProvider = "ends_ly")
    public void endsLyTest(String str, boolean expected){
        Assert.assertEquals(endsLy.endsLy(str), expected);
    }
}
