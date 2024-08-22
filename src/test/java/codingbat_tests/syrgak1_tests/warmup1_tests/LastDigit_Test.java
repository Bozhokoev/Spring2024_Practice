package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigit_Test {
    LastDigit lastDigit_t = new LastDigit();

    @DataProvider(name = "LastDigit")
    public Object[][] dpLastDigit(){
        return new Object[][]{
                {7,17, true},
                {6,17, false},
                {3,113, true}
        };
    }

    @Test(description = "Verify LastDigit Function", dataProvider = "LastDigit")
    public void lastDigitTest(int a, int b, boolean exp){
        Assert.assertEquals(lastDigit_t.lastDigit(a, b), exp);
    }
}
