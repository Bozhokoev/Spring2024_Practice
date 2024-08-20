package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {

    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "nearHundred")
    public Object[][] dpNearHundred() {
        return new Object[][]{
                {93, true},
                {90, true},
                {89, false},
                {110, true},
                {111, false},
                {121, false},
                {-101, false},
                {-209, false},
                {190, true},
                {209, true},
                {0, false},
                {5, false},
                {-50, false},
                {191, true},
                {189, false},
                {200, true},
                {210, true},
                {211, false},
                {290, false}
        };
    }

    @Test(description = "Verify Near Hundred", dataProvider = "nearHundred")
    public void nearHundred_test(int a, boolean res) {
        Assert.assertEquals(nearHundred.nearHundred(a), res);
    }

}
