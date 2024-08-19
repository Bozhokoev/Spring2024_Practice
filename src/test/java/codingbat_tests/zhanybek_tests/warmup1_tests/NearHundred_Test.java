package codingbat_tests.zhanybek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {
    @DataProvider(name = "nearHundredData")
    public Object[][] nearHundredData(){
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
    @Test (dataProvider ="nearHundredData"  )
    public void nearHundredTest(int n, boolean expected) {
        NearHundred nearHundred = new NearHundred();
        boolean result = nearHundred.nearHundred(n);
        System.out.println("Running test with n: " + n + " -> Expected: " + expected + ", Result: " + result);
        Assert.assertEquals(result, expected, "The nearHundred method failed for input: " + n);
        System.out.println("Hello");

    }

}
