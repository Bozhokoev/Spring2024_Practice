package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.FrontBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontBack_Test {
    FrontBack frontBack = new FrontBack();

    @DataProvider(name = "front_back")
    public Object[][] dpFrontBack(){
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"},
                {"", ""},
                {"Chocolate", "ehocolatC"}
        };
    }

    @Test(description = "Verify front back function", dataProvider = "front_back")
    public void frontBack(String str, String expected){
        Assert.assertEquals(frontBack.frontBack(str), expected);
    }
}
