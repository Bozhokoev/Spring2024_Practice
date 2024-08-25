package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.StringSplosion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringSplosion_Test {

    StringSplosion stringSplosion = new StringSplosion();

    @DataProvider(name = "string_splosion")
    public Object[][] dpStringSplosion(){
        return new Object[][]{
                {"Code", "CCoCodCode"},
                {"abc", "aababc"},
                {"ab", "aab"},
                {"x", "x"},
                {"fade", "ffafadfade"},
        };
    }

    @Test(description = "Verify String_Splosion Function", dataProvider = "string_splosion")
    public void stringSplosionTest(String str, String exp){
        Assert.assertEquals(stringSplosion.stringSplosion(str), exp);
    }
}
