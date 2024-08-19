package codingbat_tests.aidar_tests.warmup1_tests;


import codingbat.aidar.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class NearHundred_Test {
  @DataProvider (name = "NearHundred")
    public Object [][] dpNearHundred () {
            return new Object [][] {
                    {93, true},
                    {90, true},
                    {88, false},
                    {110, true},
                    {111, false},
                    {121, false}
            };
    }
    @Test (description = "NearHundred_test", dataProvider = "NearHundred")
    public void testNearHundred(int n, boolean except) {
        NearHundred nearHundred = new NearHundred();
        boolean res = nearHundred.nearHundred(n);
        Assert.assertEquals(res, except);
    }
}
