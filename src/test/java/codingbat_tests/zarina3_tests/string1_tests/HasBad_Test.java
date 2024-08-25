package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBad_Test {

    HasBad hasBad = new HasBad();

    @DataProvider(name = "HasBad")
    public Object[][] dpHasBad(){
        return new Object[][]{
                {"badxx", true},
                {"xbadxx", true},
                {"ba", false},
                {"", false}
        };
    }
    @Test(description = "Verify HasBad Test", dataProvider = "HasBad")
    public void hasBadTest(String str, boolean res){
        Assert.assertEquals(hasBad.hasBad(str),res);
    }

}
