package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigit_Test {
    LastDigit lastDigit = new LastDigit();

    @DataProvider(name = "lastDigit")
    public Object[][] dpLastDigit(){
        return new Object[][]{
                {7, 17,true},
                {10, 0,true},
                {11, 0,false},
                {3, 113,true},
        };
    }

    @Test(description = "Verify LastDigit function", dataProvider = "lastDigit")
    public void lastDigitTest(int a, int b, boolean exp){
        Assert.assertEquals(lastDigit.lastDigit(a,b),exp);
    }
}
