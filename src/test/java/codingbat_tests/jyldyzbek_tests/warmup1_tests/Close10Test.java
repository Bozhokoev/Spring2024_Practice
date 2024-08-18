package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.Close10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Close10Test {

    @DataProvider(name = "close10DataProvider")
    public Object[][] close10DataProvider() {
        return new Object[][]{
                {8, 13, 8},
                {13, 8, 8},
                {13, 7, 0},
                {7, 13, 0},
                {9, 13, 9},
                {13, 8, 8},
                {10, 12, 10},
                {11, 10, 10},
                {5, 21, 5},
                {0, 20, 0},
                {10, 10, 0}
        };
    }

    @Test(dataProvider = "close10DataProvider")
    public void testClose10(int a, int b, int expected) {
        Close10 close10 = new Close10();
        Assert.assertEquals(
                close10.close10(a, b),
                expected);
    }
}
