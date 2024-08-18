package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.FrontBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontBack_Test {
    FrontBack frontBack = new FrontBack();

    @DataProvider(name = "frontBack")
    public Object[][] dpFrontBack() {
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "cba"},
                {"", ""},
                {"Chocolate", "ehocolatC"},
        };
    }
    
    @Test(description = "Verify FrontBack function",dataProvider = "frontBack")
    public void frontBackTest(String str, String exp){
        Assert.assertEquals(frontBack.frontBack(str),exp);
    }
}
