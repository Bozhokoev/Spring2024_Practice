package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {

    Makes10 makes10 = new Makes10();

    @DataProvider(name = "Makes10")
    public Object[][] dpMakes10() {
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {10, 10, true},
                {8, 2, true},
                {8, 3, false},
                {10, 42, true},
                {12, -2, true}
        };
    }

    @Test(description = "Verify Makes10", dataProvider = "Makes10")
    public void makes10_test(int a, int b, boolean res) {
        Assert.assertEquals(makes10.makes10(a, b), res);
    }
}
