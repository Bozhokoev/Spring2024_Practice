package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLy_test {

    EndsLy endsLy = new EndsLy();

    @DataProvider(name = "endsLy")
    public Object[][] dpEndsLy(){
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"oddl", false},
                {"olydd", false},
                {"ly", true},
                {"", false},
                {"falsey", false},
                {"evenly", true}
        };
    }

    @Test(description = "Verify EndsLy Functional", dataProvider = "endsLy")
    public void endsLy_test(String str, boolean res){
        Assert.assertEquals(endsLy.endsLy(str), res);
    }
}
