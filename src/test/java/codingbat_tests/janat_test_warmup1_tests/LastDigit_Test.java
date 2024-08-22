package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigit_Test {
    LastDigit lastDigit = new LastDigit();

    @DataProvider(name = "last_digit")
    public Object[][] dpLastDigit(){
        return new Object[][]{
                {7, 17, true},
                {6, 17, false},
                {3, 113, true},
                {114, 113, false},
                {114, 4, true},
        };
    }

    @Test(description = "Verify Last_Digit Function", dataProvider = "last_digit")
    public void lastDigitTest(int a, int b, boolean exp){
        Assert.assertEquals(lastDigit.lastDigit(a, b), exp);
    }

}
