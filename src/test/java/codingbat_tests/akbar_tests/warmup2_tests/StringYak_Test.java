package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.StringYak;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringYak_Test {
    StringYak stringYak = new StringYak();

    @DataProvider(name = "stringYak")
    public Object[][] dpStringYak() {
        return new Object[][]{
                {"yakpak", "pak"},
                {"yak", ""},
                {"HiyakHi","HiHi"},
                {"xxxyakyyyakzzz", "xxxyyzzz"},
        };
    }

    @Test(description = "Verify StringYak function", dataProvider = "stringYak")
    public void stringYakTest(String s, String exp){
        Assert.assertEquals(stringYak.stringYak(s),exp);
    }
}
