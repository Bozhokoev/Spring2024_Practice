package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigit_Test {

    LastDigit lastDigit = new LastDigit();

    @DataProvider(name = "lastDigit")
    public Object[][] dpLastDigit() {
        return new Object[][]{
                {7, 17, true},
                {6, 17, false},
                {3, 113, true},
                {114, 113, false},
                {114, 4, true},
                {10, 0, true},
                {11, 0, false}
        };
    }

    @Test(description = "Verify Last Difit Functional", dataProvider = "lastDigit")
    public void lastDigit_test(int a, int b, boolean res) {
        Assert.assertEquals(lastDigit.lastDigit(a, b), res);
    }
}

