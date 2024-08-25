package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.FrontBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontBack_Test {
    FrontBack frontBack = new FrontBack();

    @DataProvider(name = "FrontBack")
    public Object[][] dpFrontBack() {
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "cba"}
        };
    }

    @Test(description = "Verify FrontBack Function", dataProvider = "FrontBack")
    public void frontBackTest(String a, String exp){
        Assert.assertEquals(frontBack.frontBack(a), exp);
    }
}
