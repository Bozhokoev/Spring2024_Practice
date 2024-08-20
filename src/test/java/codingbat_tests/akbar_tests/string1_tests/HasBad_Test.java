package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBad_Test {
    HasBad hasBad = new HasBad();

    @DataProvider(name = "hasBad")
    public Object[][] dpHasBad(){
        return new Object[][]{
                {"badxx",true},
                {"xbad",true},
                {"ba", false},
                {"", false},
                {"badyy",true},
        };
    }

    @Test(description = "Verify HasBad function",dataProvider = "hasBad")
    public void hasBad_Test(String str,boolean a){
        Assert.assertEquals(hasBad.hasBad(str),a);
    }
}
