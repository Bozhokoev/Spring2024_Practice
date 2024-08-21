package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgain_Test {
    FrontAgain frontAgain = new FrontAgain();

    @DataProvider(name = "FrontAgain")
    public Object[][] dpFrontAgain(){
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"jjj", true},
                {"", false}
        };
    }
    @Test(description = "VerifyFrontAgain Test",dataProvider = "FrontAgain")
    public void frontAgainTest(String str,boolean res){
        Assert.assertEquals(frontAgain.frontAgain(str),res);
    }
}
