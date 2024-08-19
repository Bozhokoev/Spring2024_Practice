package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.StringYak;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringYak_Test {
    StringYak stringYak = new StringYak();

    @DataProvider(name = "string_yak")
    public Object[][] dpStringYak() {
        return new Object[][] {
                {"yakpak", "pak"},
                {"pakyak", "pak"},
                {"yak123ya", "123ya"},
                {"yak", ""},
                {"HiyakHi", "HiHi"}
        };
    }

    @Test(description = "Verify String Yak Function", dataProvider = "string_yak")
    public void stringYakTest (String str, String exp) {
        Assert.assertEquals(stringYak.stringYak(str), exp);
    }
}

