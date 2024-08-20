package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBad_Test {
    HasBad hasBad = new HasBad();

    @DataProvider(name = "has_bad")
    public Object[][] dpHasBad(){
        return new Object[][]{
                {"badxx", true},
                {"xxbadxx", false},
                {"bad", true},
                {"", false},
                {"code", false}
        };
    }

    @Test(description = "Verify hasBad function", dataProvider = "has_bad")
    public void hasBadTest(String str, boolean expected){
        Assert.assertEquals(hasBad.hasBad(str), expected);
    }
}
