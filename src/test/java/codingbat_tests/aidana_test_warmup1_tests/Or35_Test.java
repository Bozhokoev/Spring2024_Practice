package codingbat_tests.aidana_test_warmup1_tests;

import codingbat.aidana.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Or35_Test {

    @DataProvider(name = "or35Data")
    public Object[][] or35Data() {
        return new Object[][]{
                {15, true},
                {10, false},
                {45, true},
                {30, true},
                {25, false},
                {180, true},
                {4656, false},
                {1890, true},
                {180, true},
                {25, false},
        };
    }


    @Test(dataProvider = "or35Data")
    public void testOr35(int n, boolean expected) {
        Or35 or35 = new Or35();
        boolean result = or35.or35(n);
        if (result == expected) {
            System.out.println("Test passed for input " + n + ". Expected: " + expected + ", Got: " + result);
        } else {
            System.out.println("Test failed for input " + n + ". Expected: " + expected + ", Got: " + result);
        }
    }


}
