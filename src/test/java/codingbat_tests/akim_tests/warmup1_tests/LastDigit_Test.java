package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigit_Test {
    LastDigit lastDigit = new LastDigit();

    @DataProvider(name = "last_digit")
    public Object[][] dpLastDigit(){
        return new Object[][]{
                {7, 17, true},
                {3, 113, true},
                {114, 113, false},
                {10, 0, true},
                {11, 0, false}
        };
    }

    @Test(description = "Verify lastDigit function", dataProvider = "last_digit")
    public void lastDigitTest(int a, int b, boolean expected){
        Assert.assertEquals(lastDigit.lastDigit(a, b), expected);
    }
}
