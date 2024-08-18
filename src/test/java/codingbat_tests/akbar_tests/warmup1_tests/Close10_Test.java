package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Close10;
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
                {7, 13, 0},
                {0, 20, 0},
                {10, 10, 0},
                {10, 12, 10},
        };
    }

    @Test(description = "Verify Close10 function", dataProvider = "close10")
    public void close10Test(int a, int b, int exp) {
        Assert.assertEquals(close10.close10(a, b), exp);
    }

}
