package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgain_Test {
    FrontAgain frontAgain = new FrontAgain();

    @DataProvider(name = "front_again")
    public Object[][] dpFrontAgain(){
        return new Object[][]{
                {"edited", true},
                {"jjjk", false},
                {"jjj", true},
                {"java",false},
                {"javaja", true}
        };
    }

    @Test(description = "Verify frontAgain function", dataProvider = "front_again")
    public void frontAgainTest(String str, boolean expected){
        Assert.assertEquals(frontAgain.frontAgain(str), expected);
    }
}
