package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.StringSplosion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringSplosion_Test {
    StringSplosion stringSplosion = new StringSplosion();

    @DataProvider(name = "string_splosion")
    public Object[][] dpStringSplosion() {
        return new Object[][] {
                {"Code", "CCoCodCode"},
                {"ab", "aab"},
                {"x", "x"},
                {"fade", "ffafadfade"},
                {"Good", "GGoGooGood"}
        };
    }

    @Test(description = "Verify String Splosion Function", dataProvider = "string_splosion")
    public void stringSplosionTest (String str, String exp) {
        Assert.assertEquals(stringSplosion.stringSplosion(str), exp);
    }
}
