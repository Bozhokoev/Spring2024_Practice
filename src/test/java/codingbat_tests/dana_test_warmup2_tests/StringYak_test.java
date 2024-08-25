package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.StringYak;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringYak_test {

    StringYak stringYak = new StringYak();

    @DataProvider(name = "stringYak")
    public Object[][] dpStringYak(){
        return new Object[][]{
                {"yakpak", "pak"},
                {"pakyak", "pak"},
                {"yak123ya", "123ya"},
                {"yak", ""},
                {"yakxxxyak", "xxx"},
                {"HiyakHi", "HiHi"},
                {"xxxyakyyyakzzz", "xxxyyzzz"}
        };
    }

    @Test(description = "Verify StringYak Functional", dataProvider = "stringYak")
    public void stringYak_test(String str, String res){
        Assert.assertEquals(stringYak.stringYak(str), res);
    }
}
