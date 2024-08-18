package codingbat_tests.vika_tests.warmup1;

import codingbat.vika.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {
    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "near_hundred")
    public Object[][] dpNearHundred() {
        return new Object[][] {
                {93, true},
                {-101, false},
                {-209, false},
                {200, true},
                {210, true}
        };
    }

    @Test(description = "Verify Near Hundred Function", dataProvider = "near_hundred")
    public void nearHundredTest (int n, boolean exp) {
        Assert.assertEquals(nearHundred.nearHundred(n), exp);
    }
}
