package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBad_Test {
    HasBad hasBad = new HasBad();

    @DataProvider(name = "has_bad")
    public Object[][] dpHasBad(){
        return new Object[][]{
                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
                {"code", false},
                {"bad", true},
        };
    }
    @Test(description = "Verify Has_Bad Function", dataProvider = "has_bad")
    public void hasBadTest(String str, boolean exp){
        Assert.assertEquals(hasBad.hasBad(str), exp);
    }
}
