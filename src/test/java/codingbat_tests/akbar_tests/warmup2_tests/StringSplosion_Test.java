package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.StringSplosion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringSplosion_Test {
    StringSplosion stringSplosion = new StringSplosion();

    @DataProvider(name = "stringSplosion")
    public Object[][] dpStringSplosion(){
        return new Object[][]{
                {"Code","CCoCodCode"},
                {"abc","aababc"},
                {"Kitten","KKiKitKittKitteKitten"},
                {"Good","GGoGooGood"},
                {"Bad","BBaBad"},
        };
    }

    @Test(description = "Verify StringSplosion function",dataProvider = "stringSplosion")
    public void stringSplosionTest(String s, String exp){
        Assert.assertEquals(stringSplosion.stringSplosion(s),exp);
    }
}
