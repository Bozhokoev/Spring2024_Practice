package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLy_Test {
    EndsLy endsLy = new EndsLy();

    @DataProvider(name = "ends_ly")
    public Object[][] dpEndsLy(){
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"oddl", false},
                {"olydd", false},
        };
    }
    @Test(description = "Verify Ends_Ly Function", dataProvider = "ends_ly")
    public void endsLyTest(String str, boolean exp){
        Assert.assertEquals(endsLy.endsLy(str), exp);
    }
}
