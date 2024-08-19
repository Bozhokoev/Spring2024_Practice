package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.StringSplosion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringSplosion_Test {
    StringSplosion stringSplosion = new StringSplosion();
    @DataProvider(name = "StringSplosion")
    public Object [][] dpStringSplosion(){
        return new Object[][]{
                {"Code","CCoCodCode"},
                {"ab","aab"},
                {"x","x"},
        };
    }
    @Test(description = "Verify StringSplosion Function",dataProvider = "StringSplosion")
    public void stringSplosionTest(String str, String res){
        Assert.assertEquals(stringSplosion.stringSplosion(str),res);
    }
}
