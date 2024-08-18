package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.FrontBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontBack_Test {
    FrontBack frontBack = new FrontBack();

    @DataProvider(name = "frontBack")
    public Object[][] dpFrontBack(){
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "cba"},
                {"", ""},
                {"Chocolate", "ehocolatC"},
                {"aavJ", "Java"},
                {"hello", "oellh"}
        };
    }
    @Test(description = "Verify Front Back", dataProvider = "frontBack")
    public void frontBack_test(String str, String res){
        Assert.assertEquals(frontBack.frontBack(str),res);
}
}
