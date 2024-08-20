package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgain_Test {
    FrontAgain frontAgain = new FrontAgain();

    @DataProvider(name = "frontAgain")
    public Object[][] dpFrontAgain(){
        return new Object[][]{
                {"edited", true},
                {"ed", true},
                {"jj",true},
                {"jjjk",false},
                {"",false},
        };
    }

    @Test(description = "Verify FrontAgain function", dataProvider = "frontAgain")
    public void frontAgainTest(String str, boolean exp){
        Assert.assertEquals(frontAgain.frontAgain(str),exp);
    }
}
