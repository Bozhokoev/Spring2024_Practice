package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.StringYak;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringYak_Test {
    StringYak stringYak = new StringYak();

    @DataProvider(name = "string_yak")
    public Object[][] dpStringYak(){
        return new Object[][]{
                {"yakpak", "pak"},
                {"yak123ya", "123ya"},
                {"yakxxxyak", "xxx"},
                {"HiyakHi", "HiHi"},
                {"xxxyakyyyakzzz", "xxxyyzzz"}
        };
    }

    @Test(description = "Verify stringYak function", dataProvider = "string_yak")
    public void stringYak(String str, String expected){
        Assert.assertEquals(stringYak.stringYak(str), expected);
    }
}
