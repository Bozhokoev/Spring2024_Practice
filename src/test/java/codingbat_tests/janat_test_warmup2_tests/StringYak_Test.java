package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.StringYak;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringYak_Test {
    StringYak stringYak = new StringYak();

    @DataProvider(name = "string_yak")
    public Object[][] dpStringYak(){
        return new Object[][]{
                {"yakpak", "pak"},
                {"pakyak", "pak"},
                {"yak123ya", "123ya"},
                {"yak", ""},
                {"yakxxxyak", "xxx"},
        };
    }

    @Test(description = "Verify String_Yak Function", dataProvider = "string_yak")
    public void stringYakTest(String str, String exp){
        Assert.assertEquals(stringYak.stringYak(str), exp);
    }
}
