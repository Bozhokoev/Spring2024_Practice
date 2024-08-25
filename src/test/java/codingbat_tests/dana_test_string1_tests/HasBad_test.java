package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBad_test {

    HasBad hasBad = new HasBad();

    @DataProvider(name = "hasBad")
    public Object[][] dpHasBad(){
        return new Object[][]{
                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
                {"code", false},
                {"bad", true},
                {"ba", false},
                {"xba", false},
                {"xbad", true},
                {"", false},
                {"badyy", true}
        };
    }

    @Test(description = "Verify HasBad Functional", dataProvider = "hasBad")
    public void hasBad_test(String str, boolean res){
        Assert.assertEquals(hasBad.hasBad(str), res);
    }
}
