package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.Close10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Close10_Test {
    Close10 close10 = new Close10();

    @DataProvider(name = "close10")
    public Object[][] dpClose10() {
        return new Object[][]{
                {8, 13, 8},
                {13, 8, 8},
                {13, 7, 0},
                {7, 13, 0},
                {9, 13, 9},
                {13, 8, 8},
                {10, 12, 10},
                {0, 20, 0}
        };
    }

    @Test(description = "Verify close10 Functional", dataProvider = "close10")
    public void close10_test(int a, int b, int res) {
        Assert.assertEquals(close10.close10(a, b), res);
    }
}

