package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFront_Test {
    DeFront deFront = new DeFront();

    @DataProvider(name = "de_front")
    public Object[][] dpDeFront(){
        return new Object[][]{
                {"Hello", "llo"},
                {"xby", "by"},
                {"aaa", "aa"},
                {"abxyz", "abxyz"}
        };
    }

    @Test(description = "Verify deFront function", dataProvider = "de_front")
    public void deFront(String str, String expected){
        Assert.assertEquals(deFront.deFront(str), expected);
    }
}
