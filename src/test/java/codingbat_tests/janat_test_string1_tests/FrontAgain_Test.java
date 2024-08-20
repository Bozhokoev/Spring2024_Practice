package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgain_Test {
    FrontAgain frontAgain = new FrontAgain();

    @DataProvider(name = "front_again")
    public Object[][] dpFrontAgain(){
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"ed", true},
                {"jj", true},
                {"jjj", true},
        };
    }
    @Test(description = "Verify Front_Again Function", dataProvider = "front_again")
    public void frontAgainTest(String str, boolean exp){
        Assert.assertEquals(frontAgain.frontAgain(str), exp);
    }
}
