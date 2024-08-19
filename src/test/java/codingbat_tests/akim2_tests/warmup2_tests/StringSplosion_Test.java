package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.StringSplosion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringSplosion_Test {
    StringSplosion stringSplosion = new StringSplosion();

    @DataProvider(name = "string_splosion")
    public Object[][] dpStringSplosion(){
        return new Object[][]{
                {"Code", "CCoCodCode"},
                {"There", "TThTheTherThere"},
                {"Good", "GGoGooGood"},
                {"fade", "ffafadfade"},
                {"x", "x"}
        };
    }

    @Test(description = "Verify stringsplosion function", dataProvider = "string_splosion")
    public void stringSplosionTest(String str, String expected){
        Assert.assertEquals(stringSplosion.stringSplosion(str), expected);
    }
}
