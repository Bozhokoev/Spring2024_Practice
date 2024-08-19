package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.StringBits;
import codingbat.dana.warmup2.StringSplosion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringSplosion_test {

    StringSplosion stringSplosion = new StringSplosion();

    @DataProvider(name = "stringSplosion")
    public Object[][] dpStringSplosion(){
        return new Object[][]{
                {"Code", "CCoCodCode"},
                {"abc", "aababc"},
                {"ab", "aab"},
                {"x", "x"},
                {"fade", "ffafadfade"},
                {"There", "TThTheTherThere"},
                {"Kitten", "KKiKitKittKitteKitten"},
                {"Bye", "BByBye"},
                {"Good", "GGoGooGood"},
                {"Bad", "BBaBad"}
        };
    }

    @Test(description = "Verify String Splosion Functional", dataProvider = "stringSplosion")
    public void stringSplosion_test(String str, String res){
        Assert.assertEquals(stringSplosion.stringSplosion(str), res);
    }
}
