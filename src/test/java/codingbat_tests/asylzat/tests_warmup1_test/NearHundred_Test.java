package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {
    NearHundred nearHundred = new NearHundred();

    @DataProvider (name = "near_hundred_true")
    public Object[][] setNearHundred() {
        return  new Object[][] {
                {93, true},
                {90, true},
                {89, false},
                {110, true},
                {111, false},
        };
    }
    @Test(dataProvider = "near_hundred_true")
    public void setNearHundred(int n, boolean expected) {
        Assert.assertEquals(nearHundred.nearHundred(n),expected);
    }

}
