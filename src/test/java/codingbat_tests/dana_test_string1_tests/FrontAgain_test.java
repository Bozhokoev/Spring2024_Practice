package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgain_test {

    FrontAgain frontAgain = new FrontAgain();

    @DataProvider(name = "frontAgain")
    public Object[][] dpFrontAgain(){
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"ed", true},
                {"jj", true},
                {"jjj", true},
                {"jjjj", true},
                {"jjjk", false	},
                {"x", false},
                {"", false},
                {"java", false	},
                {"javaja", true}
        };
    }

    @Test(description = "Verify FrontAgain Functional", dataProvider = "frontAgain")
    public void frontAgain_test(String str, boolean res){
        Assert.assertEquals(frontAgain.frontAgain(str), res);
    }
}
