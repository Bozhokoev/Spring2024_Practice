package codingbat_tests.asylzat.tests_warmup1_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HearHundred {
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(n - 200) <= 10));
    }
    @DataProvider( name = "nearHundredDataProvider")
    public Object[][] dataProvider(){
        return  new Object[][] {
                {90, true},
                {110, true},
                {89, false},
                {190,false},
                {200, true},
                {210, true},
                {211, false},
                {150, false},
                {100, true},
                {199, true},
        };
    }
    @Test (dataProvider = "nearNundredDataProvider")
    public void testNearHundred (int n, boolean expected) {
        Assert.assertEquals(nearHundred(n), expected);
    }
}
