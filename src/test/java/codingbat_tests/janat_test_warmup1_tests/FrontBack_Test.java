package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.FrontBack;
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
                {"abc", "cba"},
                {"", ""},
        };
    }

    @Test(description = "Verify Front_Back Function", dataProvider = "front_back")
    public void frontBackTest(String str, String exp){
        Assert.assertEquals(frontBack.frontBack(str), exp);
    }

}
