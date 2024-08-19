package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.StringYak;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringYak_Test {

    StringYak stringYak = new StringYak();
    @DataProvider(name = "StringYak")
    public Object[][] dpStringYak(){
        return new Object[][]{
                {"yakpak", "pak"},
                {"yak", ""},
                {"pakyak", "pak"},
                {"xxxyakyyyakzzz", "xxxyyzzz"},

        };
    }
    @Test(description = "Verify StringYak Function",dataProvider = "StringYak")
    public void stringYakTest(String str, String res){
        Assert.assertEquals(stringYak.stringYak(str),res);
    }
}
